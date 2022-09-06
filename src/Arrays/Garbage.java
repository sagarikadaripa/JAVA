package Arrays;

public class Garbage {
    public static int garbageCollection(String[] garbage, int[] travel) {
        int lastIdxG = -1,lastIdxP = -1,lastIdxM = -1;
        int g = 0,p = 0, m = 0;
        for(int i = 0; i< garbage.length;i++){
            for(int j = 0;j < garbage[i].length();j++){
                if(garbage[i].charAt(j) == 'P'){
                     p++;
                    lastIdxP = i;
                }
                   
                else if(garbage[i].charAt(j)  == 'G'){
                    g++;
                    lastIdxG = i;
                }
                    
                else{
                    m++;
                    lastIdxM = i;
                }
                    
            }
        }
        int ansG = 0,ansP = 0,ansM = 0;
        for(int i = 0; i < garbage.length;i++){
            if(i <= lastIdxP){
                if(i > 0)
                    ansP+= travel[i - 1];
            }
            if(i <= lastIdxG){
                if(i > 0)
                    ansG+= travel[i - 1];
            }
            if(i <= lastIdxM){
                if(i > 0)
                    ansM+= travel[i - 1];
            }
        }
        ansP+=p; ansG+=g;ansM+=m;
        return ansG+ansP+ansM;
    }
    public static void main(String[] args){

        String garbage[] = {"MMM","PGM","GP"};
        int travel[] = {3,10};
        int ans = garbageCollection(garbage, travel);
        System.out.println(ans);
    }
}
    

