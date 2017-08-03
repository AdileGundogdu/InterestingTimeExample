public class app {
    public static class Application {

        public static void main(String[] args) throws InterruptedException {
            System.out.println(message.Message.date());

            int i = 0;
            while(i < 100){
                if(message.Message.date().getSeconds() <= 9){
                    System.out.println(message.Message.date().getHours()+":"+ message.Message.date().getMinutes()+":0"+ message.Message.date().getSeconds());
                }else{
                    System.out.println(message.Message.date().getHours()+":"+ message.Message.date().getMinutes()+":"+ message.Message.date().getSeconds());
                }


                Thread.sleep(1000);
                i++;
            }
        }

    }

}
