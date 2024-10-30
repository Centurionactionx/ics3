def find_81403rd_digit():
    blocks = ["345", "543"]  # Alternating blocks
    digit_position = 81403  # The digit we are looking for
    
    current_position = 0
    n = 1  # Start from the first segment
    block_index = 0  # Start with "345"
    
    while True:
        # Length of current segment = length of block (3) + number of zeros (n)
        segment_length = 3 + n
        print(current_position)
        # Check if the 81403rd digit is within this segment
        if current_position + segment_length >= digit_position:
            # Find the relative position within the segment
            position_in_segment = digit_position - current_position - 1
            
            # If it's within the block ("345" or "543")
            if position_in_segment < 3:
                return blocks[block_index][position_in_segment]
            else:
                # It's one of the zeros
                return '0'
        
        # Move to the next segment
        current_position += segment_length
        n += 1
        block_index = 1 - block_index  # Alternate between 0 ("345") and 1 ("543")

# Find the 81403rd digit
digit = find_81403rd_digit()
print(f"The 81403rd digit is: {digit}")
