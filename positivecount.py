def count_numbers():
    positive_count = 0
    negative_count = 0
    zero_count = 0
    
    while True:
        num = int(input("Enter a number (enter 0 to stop): "))
        
        if num > 0:
            positive_count += 1
        elif num < 0:
            negative_count += 1
        else:
            zero_count += 1
        
        if num == 0:
            break
    
    print("Count of positive numbers:", positive_count)
    print("Count of negative numbers:", negative_count)
    print("Count of zeros:", zero_count)

count_numbers()