package fileLesson.homework;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class ReadText {
    public static void main(String[] args) throws IOException {
        FileInputStream fis = new FileInputStream("./src/fileLesson/new/matn.txt");
        int charakter = 0;
        int a = 0;
        int b = 0;
        int c = 0;
        int d = 0;
        int e = 0;
        int f = 0;
        int g = 0;
        int h = 0;
        int i = 0;
        int j = 0;
        int k = 0;
        int l = 0;
        int m = 0;
        int n = 0;
        int o = 0;
        int p = 0;
        int q = 0;
        int r = 0;
        int s = 0;
        int t = 0;
        int u = 0;
        int v = 0;
        int w = 0;
        int x = 0;
        int y = 0;
        int z = 0;
        while (charakter != -1){
            charakter = fis.read();
            if ((char) charakter == 'a') a++;
            if ((char) charakter == 'b') b++;
            if ((char) charakter == 'c') c++;
            if ((char) charakter == 'd') d++;
            if ((char) charakter == 'e') e++;
            if ((char) charakter == 'f') f++;
            if ((char) charakter == 'g') g++;
            if ((char) charakter == 'h') h++;
            if ((char) charakter == 'i') i++;
            if ((char) charakter == 'j') j++;
            if ((char) charakter == 'k') k++;
            if ((char) charakter == 'l') l++;
            if ((char) charakter == 'm') m++;
            if ((char) charakter == 'n') n++;
            if ((char) charakter == 'o') o++;
            if ((char) charakter == 'p') p++;
            if ((char) charakter == 'q') q++;
            if ((char) charakter == 'r') r++;
            if ((char) charakter == 's') s++;
            if ((char) charakter == 't') t++;
            if ((char) charakter == 'u') u++;
            if ((char) charakter == 'v') v++;
            if ((char) charakter == 'w') w++;
            if ((char) charakter == 'x') x++;
            if ((char) charakter == 'y') y++;
            if ((char) charakter == 'z') z++;
//            System.out.println((char) charakter);

        }
        System.out.println("a= "+a);
        System.out.println("b= "+b);
        System.out.println("b= "+c);
        System.out.println("d= "+d);
        System.out.println("e= "+e);
        System.out.println("f= "+f);
        System.out.println("g= "+g);
        System.out.println("h= "+h);
        System.out.println("i= "+i);
        System.out.println("j= "+j);
        System.out.println("k= "+k);
        System.out.println("l= "+l);
        System.out.println("m= "+m);
        System.out.println("n= "+n);
        System.out.println("o= "+o);
        System.out.println("p= "+p);
        System.out.println("q= "+q);
        System.out.println("r= "+r);
        System.out.println("s= "+s);
        System.out.println("t= "+t);
        System.out.println("u= "+u);
        System.out.println("v= "+v);
        System.out.println("w= "+w);
        System.out.println("x= "+x);
        System.out.println("y= "+y);
        System.out.println("z= "+z);
    }
}
