package overloading;

public class VectorThree {
    private int[] cost = new int[3];

    public VectorThree (int a, int b, int c) {
        this.cost[0] = a;
        this.cost[1] = b;
        this.cost[2] = c;
    }

    public void setCost (int in, int val) {
        this.cost[in] = val;
    }

    public int getCost (int in) {
        return this.cost[in];
    }

    public int increase (VectorThree vec) {
        int result = 0;
        for (int i = 0; i < 3; i++) {
            System.out.print(result+" + (" +this.cost[i] + "," +this.cost[i]+ ") = " );
            result += this.getCost(i) * vec.getCost(i);
            System.out.print(result);
        }
        return result;
    }

    public void display () {
        System.out.println("(" + this.cost[0] + ","+ this.cost[1] + ","+ this.cost[2] +")");
    }

    public VectorThree increase (int scal) {
        VectorThree res = new VectorThree(0, 0, 0);
        for (int i = 0; i < 3; i++) {
            res.setCost(i, this.getCost(i) * scal);
        }
        return res;
    }
}