public class checkScoreStudent {
    public String check(String wish, double total, double scoreMath) {
        String res = "Trượt";
        switch (wish) {
            case "Toán":
                if(total >= 42 && scoreMath >= 8.5) {
                    res = "Đỗ toán";
                }
                break;
            case "Tin":
                if(total >= 41 && scoreMath >= 8) {
                    res = "Đỗ tin";
                }
                break;
            default:
                if(total >= 42) {
                    if(scoreMath >= 8.5) {
                        res = "Đỗ toán";
                    }
                    else if(scoreMath >= 8) {
                        res = "Đỗ tin";
                    }
                } else if (total >= 41) {
                    if(scoreMath >= 8) {
                        res = "Đỗ tin";
                    }
                }
        }
        return res;
    }
}
