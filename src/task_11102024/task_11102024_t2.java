package task_11102024;

public class task_11102024_t2 {

    public static void main(String[] args) {
        //types of operaters
        //1) Arthamatic operaters : + ,- , * ,% , /
        int a= 25 ;
        int b= 45 ;
        System.out.println("======Arthamatic operaters========" );
        System.out.println( a+b ) ;
        System.out.println(a-b);
        System.out.println(a*b);
        System.out.println(b%a);
        System.out.println(b/a);
        System.out.println("======Relational operaters========" );

        //2)Relational operaters : > ,< , >= ,<= , == ,!=
        // Relational operaters output always will br boolean only ( true or false)
        System.out.println(a>b);
        System.out.println(a<b);
        System.out.println(a>=b);
        System.out.println(a<=b);
        System.out.println(a==b);
        System.out.println(a!=b);
        System.out.println("======Logical operaters========" );

        // 2)Logical operaters : and (&&) , or (||) , not (!)
        //logical operaters output always will br boolean only ( true or false)

        System.out.println( a<b && b>a);
        System.out.println( a<b || b>a);
        boolean chill_bro = true ;
        System.out.println( !chill_bro);
        System.out.println("======Assignment operaters========" );
        //Assignment operaters : = , += , -= , /= , %=
        int c=a ;
        System.out.println("Assignment operater " +c  );
        a += b ;
        System.out.println(a);
        a-=b ;
        System.out.println(a);









    }
}
