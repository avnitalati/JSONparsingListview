package com.example.hp.jsonparsinglistview1;

/**
 * Created by Hp on 2/9/2017.
 */

    public class Model {
        private int user_id;
        private int id;
        private String title;
        private String  body;

        public int getUseri() {
            return user_id;
        }

        public void setUseri(int useri) {
            this.user_id = useri;
        }

        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        public String getTitle() {
            return title;
        }

        public void setTitle(String title) {
            this.title = title;
        }

        public String getBody() {
            return body;
        }

        public void setBody(String body) {
            this.body = body;
        }
    }
