public class 2Hello {
    public static void main(String[] args) {
        if(args.length > 0){
            for(int i = 0 ; i < args.length ; i++)
                System.out.println("Hello "+args[i]+" !");
        }else
            System.out.println("Hello world !");
    }
}

/** sans la conditionnelle, le programme n'affiche que Hello !*/