public class mainTwo {
    public static void main(String[] args) {
        Gift4U one = new Gift4U(10, 3.0, 'M');
        Gift4U two = new Gift4U(6, 3.0, 'U');
        Gift4U three = new Gift4U(1, 2.0, 'M');
        Gift4U four = new Gift4U(7, 2.0, 'M');
        Gift4U five = new Gift4U(3, 4.0, 'M');
        Gift4U six = new Gift4U(2314, 4.0, 'U');
        Gift4U[] gifts = {one, two, three, four, five, six};
        superGift(gifts, 12.0);
    }

    public static void superGift(Gift4U[] menGift, double sum) {
        Gift4U[] giftForMan = new Gift4U[menGift.length];
        boolean flag = false;
        int counter = 0;
        for (int i = 0; i < menGift.length; i++) {
            if (menGift[i].isForMan()) {
                giftForMan[counter] = menGift[i];
                counter++;
            }
        }
        if (counter >= 3) {
            for (int i = 0; i < counter - 2; i++) {
                for (int j = i + 1; j < counter - 1; j++) {
                    for (int k = j + 1; k < counter; k++) {
                        if (sum == giftForMan[i].getPrice() + giftForMan[j].getPrice() + giftForMan[k].getPrice()) {
                            System.out.println(giftForMan[i].getCode() + ", " + giftForMan[j].getCode() + ", " + giftForMan[k].getCode());
                            flag = true;

                        }

                    }

                }

            }
        } if(!flag) {
            System.out.println("not == sum");
        }
    }
}
