const partial = function(fn,arg) {
  return function(anotherArg) {
    return fn(arg,anotherArg);
  }
}

const add = function(x,y) {
  return x + y;
}

const addTwo = partial(add,2);

const foo = addTwo(3)
