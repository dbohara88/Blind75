 for(int j=0; j<s.length(); j++) {
            if(!hs.contains(s.charAt(j))) {
                hs.add(s.charAt(j));
            } else{
                hs.remove(s.charAt(i));
                i++;
            }
        }