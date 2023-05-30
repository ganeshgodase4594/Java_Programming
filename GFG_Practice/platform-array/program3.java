// check the two array is eaual or not

public class Main{
    
    public static void main(String[] args){
        
        int a[]={20,10,40,70,50};
        int b[]={30,40,50,10,20};
        int temp;
        
        for(int i=0;i<a.length;i++){
            
            for(int j=i+1;j<a.length;j++){
                
                if(a[i]>a[j]){
                    
                    temp=a[i];
                    a[i]=a[j];
                    a[j]=temp;
                }
            }        
            
        }
        
        for(int i=0;i<b.length;i++){
            
            for(int j=i+1;j<b.length;j++){
                
                if(b[i]>b[j]){
                    
                    temp=b[i];
                    b[i]=b[j];
                    b[j]=temp;
                }
            }
        }
            boolean flag=true;
            
        for(int i=0,j=0;i<a.length&&j<b.length;i++,j++){
            
            if(a[i]!=b[j]){
                
                flag=false;
                
                break;
            }else{
                
                flag=true;
            }
        }
        if(flag){
            
             System.out.println("1");
        }
        else{
            
             System.out.println("0");
        }
    }
}
                
                
