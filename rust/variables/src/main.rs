fn main() {
    let mut x = 5;
    println!("The value of x is :{}", x);
    x = 6;
    println!("The value of x is :{}", x);

    const MAX_POINTS: u32 = 100_000;
    println!("The value of MAX_POINTS is :{}", MAX_POINTS);
    
    let y = 5;
    let y = y+1;
    let y = y*2;
    println!("The value of y is :{}", y);

    let spaces = "     ";
    let spaces = spaces.len();

    println!("The value of spaces is :{}", spaces);

    let guess: i32 = "42".parse().expect("Not a number");

    println!("The value of guess is :{}", guess);

    let c = 'z';
    let z  = 'Z';
    let cat = '😻';

    println!("c:{}, z:{}, cat:{}",c,z,cat);

    let tup: (i32, f64, u8) = (500, 6.4, 1);

    println!("tup is : {}",tup.0);
}
