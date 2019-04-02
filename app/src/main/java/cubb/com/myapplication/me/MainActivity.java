package cubb.com.myapplication.me;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.Window;
import android.widget.RadioButton;

import java.util.ArrayList;
import java.util.List;

import fragment.Home1Fragment;
import fragment.Home2Fragment;
import fragment.Home3Fragment;
import fragment.Home4Fragment;

public class MainActivity extends AppCompatActivity {

    private ViewPager viewPager;
    private RadioButton radioButton1;
    private RadioButton radioButton2;
    private RadioButton radioButton3;
    private RadioButton radioButton4;
    private List<Fragment> fragmentList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.activity_main);
       // getActionBar().hide();



        initView();

    }

    private void initView() {

        findViewById(R.id.backTV).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });
        viewPager = findViewById(R.id.viewPager);
        radioButton1 = findViewById(R.id.radioButton1);
        radioButton2 = findViewById(R.id.radioButton2);
        radioButton3 = findViewById(R.id.radioButton3);
        radioButton4 = findViewById(R.id.radioButton4);

        fragmentList = new ArrayList<>();

        fragmentList.add(new Home1Fragment());
        fragmentList.add(new Home2Fragment());
        fragmentList.add(new Home3Fragment());
        fragmentList.add(new Home4Fragment());


        viewPager.setOnPageChangeListener(new ViewPager.OnPageChangeListener() {
            @Override
            public void onPageScrolled(int i, float v, int i1) {

            }

            @Override
            public void onPageSelected(int i) {

                switch (i) {
                    case 0:
                        radioButton1.setChecked(true);
                        break;
                    case 1:
                        radioButton2.setChecked(true);
                        break;
                    case 2:
                        radioButton3.setChecked(true);
                        break;
                    case 3:
                        radioButton4.setChecked(true);
                        break;
                    default:

                }

            }

            @Override
            public void onPageScrollStateChanged(int i) {

            }
        });

        viewPager.setAdapter(new MyPagerAdapter(getSupportFragmentManager()));


        viewPager.setOffscreenPageLimit(4);

    }


    class MyPagerAdapter extends FragmentPagerAdapter {

        public MyPagerAdapter(FragmentManager fm) {
            super(fm);
        }

        @Override
        public Fragment getItem(int i) {
            return fragmentList.get(i);
        }

        @Override
        public int getCount() {
            return fragmentList.size();
        }


    }


    public void doClick(View view) {
        switch (view.getId()) {
            case R.id.radioButton1:
                viewPager.setCurrentItem(0);
                break;
            case R.id.radioButton2:
                viewPager.setCurrentItem(1);
                break;
            case R.id.radioButton3:
                viewPager.setCurrentItem(2);
                break;
            case R.id.radioButton4:
                viewPager.setCurrentItem(3);
                break;

        }
    }
}
