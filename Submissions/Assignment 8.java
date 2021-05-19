public class Assignment 8 {
    
    public static Int fib(Int n) {
        if (n == 0) 
            {return 0;}
        if (n == 1) 
            {return 1;}
        return fib(n-2) + fib(n-1);
    }

    public static Int fibHead(Int n) {
        if (n >= 2)
            return fibHead(n-2) + fibHead(n-1);
        if (n == 1) {return 1;}
        return 0;
    }

    public static Int fibTail(Int n) {
        if (n == 0) {return 0;}
        if (n == 1) {return 1;}
        return fibTail(n-2) + fibTail(n-1);
    }
}
