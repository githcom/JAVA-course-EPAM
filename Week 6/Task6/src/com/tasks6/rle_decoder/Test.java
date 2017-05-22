package com.tasks6.rle_decoder;

/**
 * Created by AVK on 29.03.2017.
 */
@SuppressWarnings("ALL")
public class Test {
        public static void main(String[] args) {
            Application.main(null);
            String[] arg = new String[1];
            arg[0] = null;
            Application.main(arg);
            arg[0] = "";
            Application.main(arg);
            arg[0] = "h90h4e5l2oK4k";
            Application.main(arg);
            arg[0] = "h9hhh4e5l2oK4k";
            Application.main(arg);
            arg[0] = "h9h4e5l2oK4k";
            Application.main(arg);
            arg[0] = "h9h4e5l2oKk4";
            Application.main(arg);
            arg[0] = "h9h4c1e5l2oK4k";
            Application.main(arg);
            arg[0] = "h9h4Cce5l2oK4k";
            Application.main(arg);
            arg[0] = "8h9h4Cce5l2oK4k";
            Application.main(arg);
        }
    }