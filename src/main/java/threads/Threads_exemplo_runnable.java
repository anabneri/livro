package threads;

public class Threads_exemplo_runnable {

    public static void main(String[] args) {

        new Thread(new Runnable() {
            public void run() {
                // esse código será executado em paralelo
                System.out.println("Id " + Thread.currentThread().getId());
                System.out.println("Nome " + Thread.currentThread().getName());
                System.out.println("Prioridade " + Thread.currentThread().getPriority());
                System.out.println("StackTrace " + Thread.currentThread().getStackTrace());
            }
        }).start();

    }
}
