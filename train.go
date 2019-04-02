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
	i := 1
	sum := 0
	for l1 != nil && l2 != nil {
		sum += l1.Val*i + l2.Val*i
		i = i * 10
		l1 = l1.Next
		l2 = l2.Next
	}

	for i > 1 {
		d := i
		i = i / 10
		fmt.Println(i, d, (sum/i)%d)
	}

	return &ListNode{sum, nil}
}

func main() {
	t := time.Now()
	l1 := ListNode{2, &ListNode{4, &ListNode{3, nil}}}
	l2 := ListNode{5, &ListNode{6, &ListNode{4, nil}}}
	result := addTwoNumbers(&l1, &l2)
	fmt.Println(result)
	fmt.Println(903 / 10)
	//	for i:=0;i<3;i++{
	//		fmt.Println(result)
	//		result = result.Next
	//	}
	fmt.Println("Timing:", time.Since(t))

}
