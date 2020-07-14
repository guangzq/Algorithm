struct ListNode* removeElements(struct ListNode* head, int val){
    if(head == NULL) return NULL;
    struct ListNode* sentinel = malloc(sizeof(struct ListNode));
    sentinel->next = head;
    struct ListNode* pre = sentinel;
    struct ListNode* cur = head;
    while(cur != NULL) {
        if(cur->val == val) {
            pre->next = cur->next;
        }else{
            pre=cur;
        }
        cur=cur->next;
    }
    return sentinel->next;
}