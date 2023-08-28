
// interface zeal{

//     void marry();
// }

// class dhiraj{

//     public static void main(String[] args) {
        
//         Interface sd=new dhiraj(){

//             public void marry(){

//                  System.out.println("dhiraj marry with sd");
//             }
           
//          };

//             sd.marry();

//     }
// }

interface zeal {
    void marry();
}

 class dhiraj {

    public static void main(String[] args) {
       
        zeal sd = new zeal() { // Create an anonymous inner class
           
            public void marry() {
               
                System.out.println("dhiraj marry with sd");
            }
        };

        sd.marry(); 
    }
}

