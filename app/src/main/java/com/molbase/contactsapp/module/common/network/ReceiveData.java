package com.molbase.contactsapp.module.common.network;

import java.util.List;

/**
 * SwiftRetroFit...........
 * cn.syiyi.com.network...........
 * Created by lintao.song on 2016/1/26.
 */
public class ReceiveData {

    /**
     * error : false
     * results : [{"who":"张涵宇","publishedAt":"2016-01-26T04:02:34.316Z","desc":"1.26","type":"福利","url":"http://ww2.sinaimg.cn/large/7a8aed7bjw1f0buzmnacoj20f00liwi2.jpg","used":true,"objectId":"56a5e769816dfa005aa27c38","createdAt":"2016-01-25T09:14:17.609Z","updatedAt":"2016-01-26T04:02:34.897Z"},{"who":"张涵宇","publishedAt":"2016-01-25T06:59:09.001Z","desc":"1.25","type":"福利","url":"http://ww1.sinaimg.cn/large/7a8aed7bjw1f0bifjrh39j20v018gwtj.jpg","used":true,"objectId":"56a581922e958a00517a093c","createdAt":"2016-01-25T01:59:46.062Z","updatedAt":"2016-01-25T06:59:09.566Z"},{"who":"张涵宇","publishedAt":"2016-01-22T05:14:47.832Z","desc":"1.22","type":"福利","url":"http://ww4.sinaimg.cn/large/7a8aed7bjw1f082c0b6zyj20f00f0gnr.jpg","used":true,"objectId":"56a1933ea34131005273e41f","createdAt":"2016-01-22T02:26:06.396Z","updatedAt":"2016-01-22T05:14:49.253Z"},{"who":"daimajia","publishedAt":"2016-01-21T04:50:36.905Z","desc":"meizi","type":"福利","url":"http://ww3.sinaimg.cn/large/610dc034jw1f070hyadzkj20p90gwq6v.jpg","used":true,"objectId":"56a06077a34131005269c884","createdAt":"2016-01-21T04:37:11.978Z","updatedAt":"2016-01-21T04:50:37.777Z"},{"who":"张涵宇","publishedAt":"2016-01-20T04:59:02.792Z","desc":"1.20","type":"福利","url":"http://ww1.sinaimg.cn/large/7a8aed7bjw1f05pbp0p0yj20go0mu77b.jpg","used":true,"objectId":"569ee1f17db2a2005217d3f1","createdAt":"2016-01-20T01:25:05.568Z","updatedAt":"2016-01-20T04:59:03.470Z"},{"who":"张涵宇","publishedAt":"2016-01-19T04:06:04.448Z","desc":"1.19","type":"福利","url":"http://ww1.sinaimg.cn/large/7a8aed7bjw1f04m5ngwwaj20dw0kmwgn.jpg","used":true,"objectId":"569da4462e958a0059d52ec0","createdAt":"2016-01-19T02:49:42.929Z","updatedAt":"2016-01-19T04:06:05.115Z"},{"who":"张涵宇","publishedAt":"2016-01-18T04:58:00.931Z","desc":"1.18","type":"福利","url":"http://ww1.sinaimg.cn/large/7a8aed7bjw1f03emebr4jj20ez0qoadk.jpg","used":true,"objectId":"569c434860b23e9072193534","createdAt":"2016-01-18T01:43:36.291Z","updatedAt":"2016-01-18T04:58:01.508Z"},{"who":"张涵宇","publishedAt":"2016-01-15T04:30:14.280Z","desc":"1.14","type":"福利","url":"http://ww1.sinaimg.cn/large/7a8aed7bjw1ezzaw04857j20p00gp40w.jpg","used":true,"objectId":"5697954500b0e743b73c19a5","createdAt":"2016-01-14T12:32:05.400Z","updatedAt":"2016-01-15T04:30:15.085Z"},{"who":"张涵宇","publishedAt":"2016-01-14T05:39:45.154Z","desc":"1.14","type":"福利","url":"http://ww1.sinaimg.cn/large/7a8aed7bjw1ezysj9ytj5j20f00m8wh0.jpg","used":true,"objectId":"5697006f00b0d9aca1ecf16e","createdAt":"2016-01-14T01:57:03.789Z","updatedAt":"2016-01-14T05:39:46.240Z"},{"who":"张涵宇","publishedAt":"2016-01-13T04:49:14.827Z","desc":"1.13","type":"福利","url":"http://ww2.sinaimg.cn/large/7a8aed7bjw1ezxog636o8j20du0kujsg.jpg","used":true,"objectId":"5695bb5f00b0bca0d5a8b365","createdAt":"2016-01-13T02:50:07.584Z","updatedAt":"2016-01-13T04:49:15.837Z"}]
     */

    private boolean error;
    /**
     * who : 张涵宇
     * publishedAt : 2016-01-26T04:02:34.316Z
     * desc : 1.26
     * type : 福利
     * url : http://ww2.sinaimg.cn/large/7a8aed7bjw1f0buzmnacoj20f00liwi2.jpg
     * used : true
     * objectId : 56a5e769816dfa005aa27c38
     * createdAt : 2016-01-25T09:14:17.609Z
     * updatedAt : 2016-01-26T04:02:34.897Z
     */

    private List<ResultsEntity> results;

    public void setError(boolean error) {
        this.error = error;
    }

    public void setResults(List<ResultsEntity> results) {
        this.results = results;
    }

    public boolean isError() {
        return error;
    }

    public List<ResultsEntity> getResults() {
        return results;
    }

    public static class ResultsEntity {
        private String who;
        private String publishedAt;
        private String desc;
        private String type;
        private String url;
        private boolean used;
        private String objectId;
        private String createdAt;
        private String updatedAt;

        public void setWho(String who) {
            this.who = who;
        }

        public void setPublishedAt(String publishedAt) {
            this.publishedAt = publishedAt;
        }

        public void setDesc(String desc) {
            this.desc = desc;
        }

        public void setType(String type) {
            this.type = type;
        }

        public void setUrl(String url) {
            this.url = url;
        }

        public void setUsed(boolean used) {
            this.used = used;
        }

        public void setObjectId(String objectId) {
            this.objectId = objectId;
        }

        public void setCreatedAt(String createdAt) {
            this.createdAt = createdAt;
        }

        public void setUpdatedAt(String updatedAt) {
            this.updatedAt = updatedAt;
        }

        public String getWho() {
            return who;
        }

        public String getPublishedAt() {
            return publishedAt;
        }

        public String getDesc() {
            return desc;
        }

        public String getType() {
            return type;
        }

        public String getUrl() {
            return url;
        }

        public boolean isUsed() {
            return used;
        }

        public String getObjectId() {
            return objectId;
        }

        public String getCreatedAt() {
            return createdAt;
        }

        public String getUpdatedAt() {
            return updatedAt;
        }
    }
}
