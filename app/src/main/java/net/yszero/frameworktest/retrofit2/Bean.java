package net.yszero.frameworktest.retrofit2;

import java.util.List;

public class Bean {

    /**
     * code : 200
     * message : 成功!
     * result : [{"comment":"6","down":"3","forward":"2","header":"http://wimg.spriteapp.cn/p/jie.png","name":"言梓奕mQXS [百思万女]","passtime":"2019-03-25 02:56:01","sid":"29322118","text":"医院修车，深有体会。","thumbnail":"http://wimg.spriteapp.cn/picture/2019/0324/5c96b8abdee0b_wpd.jpg","top_comments_content":"真是淋漓尽致，不过现在医院医生到点下班如果还有病人会给看完的","top_comments_header":"http://tp2.sinaimg.cn/1883535217/50/40011810931/0","top_comments_name":"小鱼的王小鱼","top_comments_uid":"13530620","top_comments_voiceuri":"","type":"video","uid":"16923762","up":"92","video":"http://wvideo.spriteapp.cn/video/2019/0324/5c96b8abdee0b_wpd.mp4"},{"comment":"6","down":"1","forward":"3","header":"http://wimg.spriteapp.cn/profile/large/2018/08/06/5b6742613dbe7_mini.jpg","name":"阿强马强赛马强 [OMEGA帮派]","passtime":"2019-03-25 02:15:02","sid":"29320840","text":"如果是你儿子你会怎么做？","thumbnail":"http://wimg.spriteapp.cn/picture/2019/0323/5c95e63b63001_wpd.jpg","top_comments_content":"干脆利落。","top_comments_header":"http://qzapp.qlogo.cn/qzapp/100336987/6D3E20E9D346C174F13CB2901186EE2F/100","top_comments_name":"七彩设计111","top_comments_uid":"17593004","top_comments_voiceuri":"","type":"video","uid":"19634336","up":"119","video":"http://wvideo.spriteapp.cn/video/2019/0323/5c95e63b63001_wpd.mp4"}]
     */

    private int code;
    private String message;
    private List<ResultBean> result;

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public List<ResultBean> getResult() {
        return result;
    }

    public void setResult(List<ResultBean> result) {
        this.result = result;
    }

    public static class ResultBean {
        /**
         * comment : 6
         * down : 3
         * forward : 2
         * header : http://wimg.spriteapp.cn/p/jie.png
         * name : 言梓奕mQXS [百思万女]
         * passtime : 2019-03-25 02:56:01
         * sid : 29322118
         * text : 医院修车，深有体会。
         * thumbnail : http://wimg.spriteapp.cn/picture/2019/0324/5c96b8abdee0b_wpd.jpg
         * top_comments_content : 真是淋漓尽致，不过现在医院医生到点下班如果还有病人会给看完的
         * top_comments_header : http://tp2.sinaimg.cn/1883535217/50/40011810931/0
         * top_comments_name : 小鱼的王小鱼
         * top_comments_uid : 13530620
         * top_comments_voiceuri :
         * type : video
         * uid : 16923762
         * up : 92
         * video : http://wvideo.spriteapp.cn/video/2019/0324/5c96b8abdee0b_wpd.mp4
         */

        private String comment;
        private String down;
        private String forward;
        private String header;
        private String name;
        private String passtime;
        private String sid;
        private String text;
        private String thumbnail;
        private String top_comments_content;
        private String top_comments_header;
        private String top_comments_name;
        private String top_comments_uid;
        private String top_comments_voiceuri;
        private String type;
        private String uid;
        private String up;
        private String video;

        public String getComment() {
            return comment;
        }

        public void setComment(String comment) {
            this.comment = comment;
        }

        public String getDown() {
            return down;
        }

        public void setDown(String down) {
            this.down = down;
        }

        public String getForward() {
            return forward;
        }

        public void setForward(String forward) {
            this.forward = forward;
        }

        public String getHeader() {
            return header;
        }

        public void setHeader(String header) {
            this.header = header;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getPasstime() {
            return passtime;
        }

        public void setPasstime(String passtime) {
            this.passtime = passtime;
        }

        public String getSid() {
            return sid;
        }

        public void setSid(String sid) {
            this.sid = sid;
        }

        public String getText() {
            return text;
        }

        public void setText(String text) {
            this.text = text;
        }

        public String getThumbnail() {
            return thumbnail;
        }

        public void setThumbnail(String thumbnail) {
            this.thumbnail = thumbnail;
        }

        public String getTop_comments_content() {
            return top_comments_content;
        }

        public void setTop_comments_content(String top_comments_content) {
            this.top_comments_content = top_comments_content;
        }

        public String getTop_comments_header() {
            return top_comments_header;
        }

        public void setTop_comments_header(String top_comments_header) {
            this.top_comments_header = top_comments_header;
        }

        public String getTop_comments_name() {
            return top_comments_name;
        }

        public void setTop_comments_name(String top_comments_name) {
            this.top_comments_name = top_comments_name;
        }

        public String getTop_comments_uid() {
            return top_comments_uid;
        }

        public void setTop_comments_uid(String top_comments_uid) {
            this.top_comments_uid = top_comments_uid;
        }

        public String getTop_comments_voiceuri() {
            return top_comments_voiceuri;
        }

        public void setTop_comments_voiceuri(String top_comments_voiceuri) {
            this.top_comments_voiceuri = top_comments_voiceuri;
        }

        public String getType() {
            return type;
        }

        public void setType(String type) {
            this.type = type;
        }

        public String getUid() {
            return uid;
        }

        public void setUid(String uid) {
            this.uid = uid;
        }

        public String getUp() {
            return up;
        }

        public void setUp(String up) {
            this.up = up;
        }

        public String getVideo() {
            return video;
        }

        public void setVideo(String video) {
            this.video = video;
        }
    }
}
