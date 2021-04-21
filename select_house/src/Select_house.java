import java.util.*;

public class Select_house {

    public static void main(String[] args){
        Scanner sca_num=new Scanner(System.in);
        int num=sca_num.nextInt();
        String[] info_array=new String[num];
        for(int i=0;i<num;i++){
            Scanner sca_info=new Scanner(System.in);
            String info=sca_info.nextLine();
            info_array[i]=info;
        }

        int[] score=new int[num];
        int[] year=new int[num];
        String[] name=new String[num];
        String[] marry=new String[num];

        for (int i = 0; i < info_array.length; i++) {
            String[] info=info_array[i].split(" ");
            score[i]=Integer.parseInt(info[3]);
            year[i]=Integer.parseInt(info[2]);
            name[i]=info[0];
            marry[i]=info[1];
        }
        //HashMap<String,Integer> name_map =new HashMap<>();
        ArrayList<String> name_list =new ArrayList<>();
        for (int i = 0; i < name.length; i++) {
            //name_map.put(name[i],i);
            name_list.add(name[i]);
        }
        //HashMap<String,Integer> marry_map =new HashMap<>();
        ArrayList<String> marry_list=new ArrayList<>();
        for (int i = 0; i < marry.length; i++) {
            //marry_map.put(marry[i],i);
            marry_list.add(marry[i]);
        }
        //HashMap<Integer,Integer> score_map =new HashMap<>();
        ArrayList<Integer> score_list=new ArrayList<>();
        for (int i = 0; i < score.length; i++) {
            //score_map.put(score[i],i);
            score_list.add(score[i]);
        }
        //HashMap<Integer,Integer> year_map =new HashMap<>();
        ArrayList<Integer> year_list=new ArrayList<>();
        for (int i = 0; i < year.length; i++) {
            //year_map.put(year[i],i);
            year_list.add(year[i]);
        }

        //LinkedList<String> link=new LinkedList<>();

        ArrayList<Integer> score_high_people=find_max(score_list);  //得到绩效最好的人的序列
        ArrayList<Integer> year_high_people=find_max(year_list);    //得到年限最好的序列
        ArrayList<Integer> unmarried_people=married(marry_list);   //得到结婚的序列
        ArrayList<Integer> name_good_people=name_rank(name_list);   //得到姓名好的序列

    }

    public static void the_result(ArrayList<Integer> score_p,ArrayList<Integer> year_p,ArrayList<Integer> married_p,ArrayList<Integer> name_p){

    }

    public static ArrayList<Integer> find_max(ArrayList<Integer> arr){
        int max=0;
        for (int i = 0; i < arr.size(); i++) {
            if(arr.get(i)>max){
                max=arr.get(i);
            }
        }
        ArrayList<Integer> result=new ArrayList<>();
        for (int i = 0; i < arr.size(); i++) {
            if(arr.get(i)==max){
                result.add(i);
            }
        }
        return result;
    }

    public static ArrayList<Integer> married(ArrayList<String> str){
        ArrayList<Integer> result=new ArrayList<>();
        for (int i = 0; i < str.size(); i++) {
            if(str.get(i).equals("married")){
                result.add(i);
            }
        }
        return result;
    }

    public static ArrayList<Integer> name_rank(ArrayList<String> str) {
        int max=0;
        for (int i = 0; i < str.size(); i++) {
            char first_ch=str.get(i).charAt(0);
            int ch_num=first_ch-'0';
            if(ch_num>max){
                max=ch_num;
            }
        }
        ArrayList<Integer> result=new ArrayList<>();
        for (int i = 0; i < str.size(); i++) {
            if((str.get(i).charAt(0)-'0')==max){
                result.add(i);
            }
        }
        return result;
    }


}
