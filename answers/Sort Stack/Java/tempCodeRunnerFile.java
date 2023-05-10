(ArrayList<Integer> stack, int value) {
        // 0. base case 
        if (stack.size() == 0) {
            stack.add(value);
            return;
        }
        
        int top = stack.remove(stack.size() - 1);
        if (value >= top) {
            // 1. if the value belongs here...
            stack.add(top);
            stack.add(value);
        }
        else {
            // 2. if the value does not belong here...
            InsertIntoStack(stack, value);

            // 3. add that top back on
            stack.add(top);
        }
    }