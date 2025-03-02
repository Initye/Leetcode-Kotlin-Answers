class Solution {
    fun mergeArrays(nums1: Array<IntArray>, nums2: Array<IntArray>): Array<IntArray> {
        val hashMap = mutableMapOf<Int, Int>()

        //Add key-value pairs
        for ((key, value) in nums1) {
                hashMap[key] = hashMap.getOrDefault(key, 0) + value
        }

        //Add/sum values for existing keys
        for ((key, value) in nums2) {
                hashMap[key] = hashMap.getOrDefault(key, 0) + value
        }
        
        //hashMap to sorted Array
        return hashMap.toSortedMap().map { (key, value) -> intArrayOf(key, value) }.toTypedArray()
    }
}