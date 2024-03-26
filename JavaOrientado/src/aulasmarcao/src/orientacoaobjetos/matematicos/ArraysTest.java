package matematicos;

public class ArraysTest {

    public static void main(String[] args) {
        int nums[] = { 2, 4, 6, 8 };
        int nums2[] = new int[4];

        System.out.println(nums.length + " tamanho1");
        System.out.println(nums2.length + " tamanho2");

        System.out.println("nums");
        System.out.println(nums[0]);
        System.out.println(nums[1]);
        System.out.println(nums[2]);
        System.out.println(nums[3]);
        System.out.println(nums[4]);

        for (int i = 0; i < nums2.length; i++) {
            nums2[i] = (int) (5 + Math.random() * 100);
        }

        System.out.println("nums2");
        System.out.println(nums2[0]);
        System.out.println(nums2[1]);
        System.out.println(nums2[2]);
        System.out.println(nums2[3]);

    }
}
