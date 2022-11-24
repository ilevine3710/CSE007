board = [[1, 2, 3],[4, 5, 6],[7, 8, 9]]
player = True

def printboard (myList = []):
    for i in range (len(myList)):
        for j in range (len(myList[i])):
            print(myList[i][j], end = " ")
        print()
    return
def turn (player, myList = [] ):
    isValid = False
    while(not isValid):
        x = input()
        for i in range (len(myList)):
            for j in range (len(myList[i])):
                if (myList[i][j] == x and not (x == "X" or x == "X")):
                    if (player):
                        myList [i][j] = "X"
                    else:
                        myList [i][j] = "O"
                    break
        print("Invalid choice. Please choose an empty spot on the board")
    return

printboard(board)
turn(player, board)
printboard(board)
