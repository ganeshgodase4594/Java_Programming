// make child thread

class Mythread extends Thread{

        Mythread(ThreadGroup tg,String str){

                super(tg,str);
        }

        public void run(){

                System.out.println(Thread.currentThread());
        }
}

class ThreadGroup3{

        public static void main(String[] args){

                ThreadGroup pthreadgp=new ThreadGroup("core2web");

                Mythread obj1=new Mythread(pthreadgp,"c");
                Mythread obj2=new Mythread(pthreadgp,"cpp");
                Mythread obj3=new Mythread(pthreadgp,"Java");

                obj1.start();
                obj2.start();
                obj3.start();

		ThreadGroup cthreadgp=new ThreadGroup(pthreadgp,"incubator");

		Mythread obj4=new Mythread(cthreadgp,"react");
                Mythread obj5=new Mythread(cthreadgp,"flutter");
                Mythread obj6=new Mythread(cthreadgp,"js");

                obj4.start();
                obj5.start();
                obj6.start();
        }
}
