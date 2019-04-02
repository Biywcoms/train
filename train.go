package main

import (
	"fmt"
	"time"
)

//ListNode 链表.
type ListNode struct {
	Val  int
	Next *ListNode
}

func addTwoNumbers(l1 *ListNode, l2 *ListNode) *ListNode {
	var l3 *ListNode
	i := 10
	j := 0
	for l1 != nil && l2 != nil {
		sum := l1.Val + l2.Val
		tmp := ListNode{sum%i + j, nil}
		j = sum / i
		if l3 == nil {
			l3 = &tmp
			fmt.Println(0, l3)
		} else {
			tmp.Next = l3
			l3 = &tmp
			fmt.Println(1, l3)
		}
		l1 = l1.Next
		l2 = l2.Next
	}
	return l3
}

func main() {
	t := time.Now()

	l1 := ListNode{2, &ListNode{4, &ListNode{3, nil}}}
	l2 := ListNode{5, &ListNode{6, &ListNode{4, nil}}}
	result := addTwoNumbers(&l1, &l2)
	for result != nil {
		fmt.Println(result)
		result = result.Next
	}

	fmt.Println("Timing:", time.Since(t))

}
