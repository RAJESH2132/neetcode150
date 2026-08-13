class Solution {

    public int calculateHoursNeeded(int[] piles, int eatingSpeed) {
        int hoursNeeded = 0;

        for (int pile : piles) {
            hoursNeeded += (pile + eatingSpeed - 1) / eatingSpeed;
        }

        return hoursNeeded;
    }

    public int minEatingSpeed(int[] piles, int maxHours) {
        int lowSpeed = 1;
        int highSpeed = 0;

        for (int pile : piles) {
            highSpeed = Math.max(highSpeed, pile);
        }

        while (lowSpeed < highSpeed) {
            int candidateSpeed = lowSpeed + (highSpeed - lowSpeed) / 2;
            int hoursNeeded = calculateHoursNeeded(piles, candidateSpeed);

            if (hoursNeeded <= maxHours) {
                highSpeed = candidateSpeed;
            } else {
                lowSpeed = candidateSpeed + 1;
            }
        }

        return lowSpeed;
    }
}