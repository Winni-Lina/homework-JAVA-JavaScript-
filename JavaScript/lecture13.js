console.log("Menu");
console.log("1. Ice Americano");
console.log("2. Cafe Lattle");
console.log("3. Cappuccino");
console.log("4. tea");

var choice = parseInt(prompt("메뉴를 선택해 주세요"));

switch(choice){
	case 1:
		console.log("아이스 아메리카노는 1500원 입니다.");
		// break;
	case 2:
		console.log("카페 라떼는 1800원 입니다.");
		// break;
	case 3:
		console.log("카푸치노 2000원 입니다.");
		break;
	case 4:
		console.log("홍차 1300원 입니다.");
		break;
	default:
		console.log("죄송합니다. 그런 메뉴는 없습니다.");
		break;
}