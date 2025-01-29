class Solution {
    fun mergeTwoLists(list1: ListNode?, list2: ListNode?): ListNode? {
        val stack = ListNode(0) //dummy
        var nodes = stack
        var l1 = list1
        var l2 = list2

        while(l1 != null && l2 != null){
                if(l1.`val` < l2.`val`) {
                    nodes.next = l1 //If the value of l1 is smaller than l2, we add the node from l1 to the merged list and move to the next node in list1.
                    l1 = l1.next
                } else {
                    nodes.next = l2 //If the value of l2 is smaller or equal to l1, we add the node from l2 to the merged list and move to the next node in list2.
                    l2 = l2.next
                }
                nodes = nodes.next!! //We move nodes pointer to the next node so we don't overwrite the current node.
            }
        //Remaining nodes 
        if (l1 != null) {
            nodes.next = l1
        } else if (l2 != null) {
            nodes.next = l2
        }

        return stack.next //We return stack.next to skip the dummy node and return the merged list starting from the first valid node since stack (dummy) is just a placeholder
    }
}