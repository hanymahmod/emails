public class array {

    private double[] a; //ref to array a
    private int nElement; //number of data items 
    

    public array(int max){ // constructor
        a= new double[max]; //cerate array
        nElement = 0; //no items yet

    }

    public void insert(double value) {// put elements into array
        a[nElement] = value;
        nElement++;

    }
    
    public void display(){
        for (int i=0 ; i<nElement; i++){
            System.out.println(a[i]);

        }
        System.out.println("");
    }

    public boolean find(double searchKey){ //liner search
        int j;
        for(j=0; j<nElement; j++)
            if(a[j] == searchKey)
                break;
            if (j == nElement)
                return false;
                
            else
                return true;      
    }

    public boolean delete(double value){ // delete items
        int j;
        for(j=0 ; j<nElement ; j++)
            if (value == a[j]) 
                break;
            if(j == nElement)
                return false;
            else{
                for(int k = j; k<nElement; k++)
                    a[k] = a[k+1];
                nElement--;
                return true;
    }
    
}
}
