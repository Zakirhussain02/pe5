//import java.util.ArrayList;
//
//public class UpdateArray {
//    public ArrayList<String> updateArray(String[] list,String[] s,int[] index){
//        ArrayList<String> lists =new ArrayList<String>();
//        //int k=index[0];
//        //int index = list.indexOf("apple");
//
//        for(int i=0;i<list.length;i++) {
//            lists.set(index[0], s[0]);
//        }
//        return (lists);
//    }
//    public static void main(String args[]){
//        //ArrayList<String> list = new ArrayList<String>();
//        String[] list = {"Apple", "Grape", "Melon", "Berry"};
//        String[] s={"kiwi","mango"};
//        int[] index={0,2};
//        UpdateArray x=new UpdateArray();
//        x.updateArray(list,s,index);
//
//    }
//}
import java.util.ArrayList;

public class UpdateArray {

    public void upDateList(String[] input,String[] inputs,int[]index)
    {
        ArrayList<String> list=new ArrayList<String>();

        int x=0;
        int y=index[x];
        int z=index.length;

        for(int i=0;i<input.length;i++)
        {
            if(i==y)
            {
                list.add(inputs[x]);
                if(x<z-1) {
                    x++; }
                y=index[x];
            }
            else
            {
                list.add(input[i]);
            }

        }
        System.out.println(list);

    }
//    public static void main(String[] args)
//    {
//        String[] input={"Apple", "Grape", "Melon", "Berry"};
//        String[] updateLists={"kiwi","Mango"};
//        int[] index={0,2};
//        UpdateArray updateList=new UpdateArray();
//        updateList.upDateList(input,updateLists,index);
//    }
}
