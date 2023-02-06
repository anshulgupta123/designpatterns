import com.anaplan.singleton.bestway.BestWaySingeton;

public class Main {
    public static void main(String[] args) {
        BestWaySingeton bestWaySingeton = BestWaySingeton.getSingleton();
        BestWaySingeton bestWaySingetonBean = BestWaySingeton.getSingleton();
        System.out.println(bestWaySingetonBean.hashCode());
        System.out.println(bestWaySingeton.hashCode());


    }
}