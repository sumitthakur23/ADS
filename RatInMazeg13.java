public class RatInMazeg13 {
    // Given an N*N Grid where some cells are blocked(denoted by 0)
    // and other are not blocked denoted by 1
    // a rat starts at the top left corner and has to reach the bottom right corner
    // Then rat can move down up left right but cannot move in blocked cells
    // we need to find all the possible paths.

    // Approach:
    // start at (0,0) and mark it as visited.
    // try moving in all 4 directions (D,U,L,R)
    // if the destination reached, add the current path to res.
    // if moving leads to invalid, backtrack.
    // use a boolean array to keep track of visited cells. 
}
