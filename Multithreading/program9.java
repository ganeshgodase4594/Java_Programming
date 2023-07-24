
class mythread extends Thread{

        public void run(){

                Thread t=Thread.currentThread();

                System.out.println(t.getPriority()); // default 5
                                                     // after setpriority 7
        }
}

class ThreadDemo{

        public static void main(String[] args){

                Thread t=Thread.currentThread();

                System.out.println(t.getPriority());  // default 5

                mythread obj=new mythread();

                obj.start();

                t.setPriority(7);

                mythread obj2=new mythread();

                obj2.start();

		obj2.start();
        }
}

// one working thread in method then at a time we do not send another thread it will give illegalthreadexception..
