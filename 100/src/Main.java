
import java.util.Collection;
import java.util.HashMap;
import java.util.Set;

public class Main {

    public static void main(String[] args) {
        HashMap<Integer,Integer> hm=new HashMap<>();
        for (int i = 1; i <=100 ; i++) {
            hm.put(i,i);
        }
        while (true){
            Set<Integer> integers = hm.keySet();
            for (Integer s:integers) {

                Integer integer = hm.get(s);
                if (integer!=0&&integer%2!=0){
                    hm.put(s,0);
                }
            }
            int i=1;
            for (Integer j:integers){
                Integer integer = hm.get(j);
                if (integer!=0) {
                    hm.put(j, i);
                    i++;
                }
                }
                Integer count=0;
            Collection<Integer> values = hm.values();
            for (Integer m:values) {
                if (m!=0){count++;}
            }
            if(count==1) {
                Collection<Integer> ss = hm.keySet();
                for (Integer sm:ss
                     ) {
                    if (hm.get(sm)==1){
                        System.out.println(sm);
                    }
                }
                break;}
        }
    }
        }


