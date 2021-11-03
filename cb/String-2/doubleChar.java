public String doubleChar(String s) {
            String s1 = "";
            String c;
            for (int i = 1; i <= s.length(); i++) {
                c = s.substring(i - 1, i);
                s1 = s1 + c + c;
            }
            return s1;
        }

