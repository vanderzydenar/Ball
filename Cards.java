import java.util.ArrayList;
public class Cards{
    public static ArrayList<Integer> selectionSort(ArrayList<Integer> list){
        for(int x = 0; x < list.size(); x++){
            for(int y = x + 1; y < list.size(); y++){
                if(list.get(y) < list.get(x)){
                    int temp = list.get(x);

                    list.set(x, list.get(y)); 
                    list.set(y, temp);
                }

            }
        }

            return list;
        } 

    public static boolean exists(ArrayList<Integer> list, int num){ 
        if(list.size() == num){
            return true;
        }
        return false;
    }

    public static boolean existsAPair(ArrayList<Integer> list, int num1, int num2){ 
        int x;
        int y;
        while(x + y = 2){
            for(int x = 0; x < list.size(); X++){
                if(list.get(x) == num){
                    x = 1;
                }
                if(list.get(y) == num){
                    y = 1;
                }              
            }
        }    
    }

    public static boolean binarySearch(ArrayList<Integer> list, int num){ 
        int splits = Math.log(list.size());

        int divideWay = 1; 
        if((list[(list.size()/2) + divideWay)) < num){
            divideWay = 1
        }
        else if((list[(list.size()/2) + 1)) > num){
            divideWay = -1;
        }


        for(int i = 0; i < splits; i += 2){
            if(divide > 0){
                if((list[list.size()-(list.size()/i) == num){
                    return true;
                }
            }
            if(divide > 0){
                if((list[list.size()/2/i) == num){
                    return true;
                }
            }
        }
        return false;
    }

    public static void main (String[] args)
    {
        ArrayList<Integer> list = new ArrayList<Integer>(); //less memory, NO LIMIT, must know for the test
        list.add(new Integer(5));
        list.add(new Integer(3));
        list.add(new Integer(4));
        System.out.println(selectionSort(list));
        System.out.println(exists(list, 5));
        System.out.println(exists(list, 3));


    }
}