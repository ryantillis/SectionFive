public class PaintJob {

    //Get bucket count

    public static int getBucketCount(double width, double height, double areaPerBucket, int extraBuckets) {
        double bucketCount = 0;
        double area = width*height;
        double buckets = area/areaPerBucket;
        bucketCount = Math.ceil(buckets);

        if(width <= 0 || height <=0 || areaPerBucket <=0 || extraBuckets < 0){return -1;}


    return (int) bucketCount - extraBuckets;}


    //Overloaded without extrabuckets

    public static int getBucketCount(double width, double height, double areaPerBucket) {
        double bucketCount = 0;
        int extraBuckets = 0;
        double area = width*height;
        double buckets = area/areaPerBucket;
        bucketCount = Math.ceil(buckets);

        if(width <= 0 || height <=0 || areaPerBucket <=0){return -1;}


        return (int) bucketCount;}


    //Overloaded without buckets or w/h
    public static int getBucketCount(double area, double areaPerBucket) {
        double bucketCount = 0;
        int extraBuckets = 0;
        double buckets = area/areaPerBucket;
        bucketCount = Math.ceil(buckets);

        if(areaPerBucket <=0 || area <= 0){return -1;}


        return (int) bucketCount;}


}
