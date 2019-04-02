package utils;

import java.util.List;

public class Infos {


    /*
    *
    * http://www.kuaidi100.com/query?type=zhongtong&postid=75137494011806
    *
    * */



    /**
     * com : zhongtong
     * condition : F00
     * data : [{"context":"【郑州市】 快件已在 【郑州新郑】 签收, 签收人: 本人, 如有疑问请电联:13598857851 / 18538567071, 您的快递已经妥投, 如果您对我们的服务感到满意, 请给个五星好评, 鼓励一下我们【请在评价快递员处帮忙点亮五颗星星哦~】","ftime":"2019-03-29 18:36:00","location":"","time":"2019-03-29 18:36:00"},{"context":"【郑州市】 【郑州新郑】 的牛长水（13598857851） 正在第1次派件, 请保持电话畅通,并耐心等待","ftime":"2019-03-29 13:22:35","location":"","time":"2019-03-29 13:22:35"},{"context":"【郑州市】 快件已经到达 【郑州新郑】","ftime":"2019-03-29 13:12:18","location":"","time":"2019-03-29 13:12:18"},{"context":"【郑州市】 快件离开 【郑州中转】 已发往 【郑州新郑】","ftime":"2019-03-29 08:12:49","location":"","time":"2019-03-29 08:12:49"},{"context":"【郑州市】 快件已经到达 【郑州中转】","ftime":"2019-03-29 07:33:29","location":"","time":"2019-03-29 07:33:29"},{"context":"【广州市】 快件离开 【广州中心】 已发往 【郑州中转】","ftime":"2019-03-28 07:08:12","location":"","time":"2019-03-28 07:08:12"},{"context":"【广州市】 快件已经到达 【广州中心】","ftime":"2019-03-28 06:56:45","location":"","time":"2019-03-28 06:56:45"},{"context":"【佛山市】 快件离开 【佛山中心】 已发往 【广州中心】","ftime":"2019-03-28 05:08:09","location":"","time":"2019-03-28 05:08:09"},{"context":"【佛山市】 快件已经到达 【佛山中心】","ftime":"2019-03-28 05:06:31","location":"","time":"2019-03-28 05:06:31"},{"context":"【广州市】 快件离开 【番禺里仁洞】 已发往 【郑州中转】","ftime":"2019-03-28 02:55:20","location":"","time":"2019-03-28 02:55:20"},{"context":"【广州市】 【番禺里仁洞】（020-22505297、020-31132480、020-31132475） 的 岁青攀 （15890874729） 已揽收","ftime":"2019-03-27 22:45:01","location":"","time":"2019-03-27 22:45:01"}]
     * ischeck : 1
     * message : ok
     * nu : 75137494011806
     * state : 3
     * status : 200
     */

    private String com;
    private String condition;
    private String ischeck;
    private String message;
    private String nu;
    private String state;
    private String status;
    private List<DataBean> data;

    public String getCom() {
        return com;
    }

    public void setCom(String com) {
        this.com = com;
    }

    public String getCondition() {
        return condition;
    }

    public void setCondition(String condition) {
        this.condition = condition;
    }

    public String getIscheck() {
        return ischeck;
    }

    public void setIscheck(String ischeck) {
        this.ischeck = ischeck;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getNu() {
        return nu;
    }

    public void setNu(String nu) {
        this.nu = nu;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public List<DataBean> getData() {
        return data;
    }

    public void setData(List<DataBean> data) {
        this.data = data;
    }

    public static class DataBean {
        /**
         * context : 【郑州市】 快件已在 【郑州新郑】 签收, 签收人: 本人, 如有疑问请电联:13598857851 / 18538567071, 您的快递已经妥投, 如果您对我们的服务感到满意, 请给个五星好评, 鼓励一下我们【请在评价快递员处帮忙点亮五颗星星哦~】
         * ftime : 2019-03-29 18:36:00
         * location :
         * time : 2019-03-29 18:36:00
         */

        private String context;
        private String ftime;
        private String location;
        private String time;

        public String getContext() {
            return context;
        }

        public void setContext(String context) {
            this.context = context;
        }

        public String getFtime() {
            return ftime;
        }

        public void setFtime(String ftime) {
            this.ftime = ftime;
        }

        public String getLocation() {
            return location;
        }

        public void setLocation(String location) {
            this.location = location;
        }

        public String getTime() {
            return time;
        }

        public void setTime(String time) {
            this.time = time;
        }
    }
}
