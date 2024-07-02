## Stack Implementations

This project provides three implementations of the Stack data structure:

1. **`ArrayListStack`:** Utilizes Java's `ArrayList` for dynamic resizing.
2. **`ArrayStack`:** Implements a stack using a fixed-size array.
3. **`LinkedListStack`:** Builds a stack using a custom linked list.

Each implementation provides the core stack operations (`push`, `pop`, `peek`, `isEmpty`, `size`). Choose the implementation that best suits your specific requirements in terms of flexibility, efficiency, and memory usage.

Refer to the Javadoc documentation for detailed method descriptions and examples.

| Implementation           | Advantages                                               | Disadvantages                                           |
| :----------------------- | :-------------------------------------------------------- | :---------------------------------------------------- |
| ArrayList Stack          | Dynamic resizing, easy to use                            | Potential overhead from resizing, no fixed capacity    |
| Array with Fixed Capacity | Efficient (constant-time operations), predictable memory  | Limited capacity, potentially wasteful memory allocation |
| Custom Linked List      | Dynamic, efficient for large stacks                        | Slightly more complex, memory overhead per node       |
