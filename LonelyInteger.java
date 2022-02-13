import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class LonelyInteger {
public static void main(String[]args) {
	List<Integer> arr = new ArrayList<Integer>();
	arr.add(0,1);
	arr.add(1,2);
	arr.add(2,3);
	arr.add(3,4);
	arr.add(4,3);
	arr.add(5,2);
	arr.add(6,1);
	lonelyinteger(arr);
		
	}

	public static int lonelyinteger(List<Integer> a) {
		for(int i =0;i<a.size();i++){
            boolean check = false;
            for(int j = 0;j<a.size();j++){
                if(j!=i && a.get(j)==a.get(i)){
                    check = true;   
                }
            }
            if(check==false){
                return a.get(i);
            }
        }
        return 0;

	   }
}
