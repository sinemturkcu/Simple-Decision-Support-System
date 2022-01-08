/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package datafinalprojectt;

/**
 *
 * @author Sinem
 */
public class Arraylist {
   
    Object[] list;
    int arSize = 0;
    int DatasetName;
    int JanuaryDemand;
    int FebruaryDemand;
    int MarchDemand;
    int AprilDemand;
    int MayDemand;
    int JuneDemand;
    int JulyDemand;
    int AugustDemand;
    int SeptemberDemand;
    int OctoberDemand;
    int NovemberDemand;
    int DecemberDemand;

    public Arraylist(int DatasetName, int JanuaryDemand, int FebruaryDemand, int MarchDemand, int AprilDemand, int MayDemand, int JuneDemand, int JulyDemand, int AugustDemand, int SeptemberDemand, int OctoberDemand, int NovemberDemand, int DecemberDemand) {
        this.DatasetName = DatasetName;
        this.JanuaryDemand = JanuaryDemand;
        this.FebruaryDemand = FebruaryDemand;
        this.MarchDemand = MarchDemand;
        this.AprilDemand = AprilDemand;
        this.MayDemand = MayDemand;
        this.JuneDemand = JuneDemand;
        this.JulyDemand = JulyDemand;
        this.AugustDemand = AugustDemand;
        this.SeptemberDemand = SeptemberDemand;
        this.OctoberDemand = OctoberDemand;
        this.NovemberDemand = NovemberDemand;
        this.DecemberDemand = DecemberDemand;
    }
    
   
    public Arraylist(int JanuaryDemand, int FebruaryDemand, int MarchDemand, int AprilDemand, int MayDemand, int JuneDemand, int JulyDemand, int AugustDemand, int SeptemberDemand, int OctoberDemand, int NovemberDemand, int DecemberDemand) {
        this.JanuaryDemand = JanuaryDemand;
        this.FebruaryDemand = FebruaryDemand;
        this.MarchDemand = MarchDemand;
        this.AprilDemand = AprilDemand;
        this.MayDemand = MayDemand;
        this.JuneDemand = JuneDemand;
        this.JulyDemand = JulyDemand;
        this.AugustDemand = AugustDemand;
        this.SeptemberDemand = SeptemberDemand;
        this.OctoberDemand = OctoberDemand;
        this.NovemberDemand = NovemberDemand;
        this.DecemberDemand = DecemberDemand;
    }

    public Arraylist() {
        list = new Object[12];
        int listSize = list.length;
    }


    public Arraylist(int n) {
        int defaultValue = 10;
        int size = n;
        list = new Object[n];

        if (size < defaultValue) {
            list = new Object[size];
        } else {
            while (size >= defaultValue) {
                defaultValue *= 2;
                n = defaultValue;
            }
            list = new Object[n];
        }

    }

  
    public void add(Object o) {
        int i = 0;
        int length = list.length;
        list = reSize();
        while(i < length){
            if(list[i] == null){
                list[i] = o;
                i = length;
            }else{
                i++;
            }
        }
        arSize++;

    }

  
    public void add(int index, Object o) {
        Object[] a2 = new Object[list.length];
        reSize();
        for (int i = 0; i < index; i++) {
            a2[i] = list[i];
        }
        a2[index] = o;

        for (int i = index + 1; i < list.length; i++) {
            a2[i] = list[i - 1];
        }

        for (int i = 0; i < list.length; i++) {
            list[i] = a2[i];
        }

        arSize++;
    }


    public Object get(int index) {

        return list[index];
    }


    public int size() {
        int listSize = 0;
        for (int i = 0; i < list.length; i++) {
            if (list[i] != null) {
                listSize++;
            }
        }
        return listSize;
    }


    public boolean isEmpty() {
        boolean empty = true;
        for (int i = 0; i < list.length; i++) {
            if (list[i] == null) {

            } else {
                empty = false;
            }
        }
        return empty;
    }


   


    public int find(Object o) {
        int i = 0;
        if(arSize == 0){
            System.out.println("Error: Your ArrayList is empty.");
        }else
            while (i < list.length) {
                if (list[i] != o) {
                    i++;
                } else {
                    return i;
                }
            }
        return -1;

    }


    public void remove(Object o) {
        int x = 0;
        Object[] a2 = new Object[list.length];
        if(arSize == 0){
            System.out.println("Error: Your ArrayList is empty.");
        }else
            while (x < list.length) {

                if (list[x] == o) {
                    for (int i = 0; i <= x - 1; i++) {
                        a2[i] = list[i];
                    }
                    for (int i = x; i < list.length - 1; i++) {
                        a2[i] = list[i + 1];
                    }

                    for (int i = 0; i < list.length - 1; i++) {
                        list[i] = a2[i];
                    }
                    x = list.length;
                } else {
                    x++;
                }
            }

    }


    public String toString() {
        int x = 0;
        String printList = "";
        if (list[0] == null) {
            return null;
        } else {
            printList = printList + "[";
            while (list[x] != null) {
                x++;
            }
            for (int i = 0; i < x - 1; i++) {
                printList = printList + list[i];
                printList = printList + ", ";

            }

            printList = printList + list[x - 1] + "]";
        }
        return printList;

    }


    private Object [] reSize(){
        Object [] temp;
        if(arSize >=list.length-1){
            temp = new Object[list.length*2];
            for(int i =0; i< list.length; i++){
                temp[i] = list[i];
            }
            list = temp;
        }
        return list;
    }
    
    public static void main(String[] args) {
        
    }
    
}
