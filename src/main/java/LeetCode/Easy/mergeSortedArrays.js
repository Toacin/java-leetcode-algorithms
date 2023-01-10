const list1 = [-1, 0, 1, 2, 3];
const list2 = [4, 5, 6, 7, 8];

const list3 = [-1, 0, 4, 1, 5]

function mergeAndSorter(list1, list2) {
    const mergedAndSortedArray = [];
    let list1index = 0;
    let list2index = 0;
    while (list1index<list1.length || list2index<list2.length) {
        if (list1index === list1.length) {
            mergedAndSortedArray.push(list2[list2index]);
            list2index++;
        } else if (list2index === list2.length) {
            mergedAndSortedArray.push(list1[list1index]);
            list1index++;
        } else if (list1[list1index] > list2[list2index]) {
            mergedAndSortedArray.push(list2[list2index]);
            list2index++;
        } else {
            mergedAndSortedArray.push(list1[list1index]);
            list1index++;
        }
    }
    return mergedAndSortedArray;
}

console.log(mergeAndSorter(list1, list2));