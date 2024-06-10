# 키친포스

## 퀵 스타트

```sh
cd docker
docker compose -p kitchenpos up -d
```

## 요구 사항

### 상품

- 상품을 등록할 수 있다.
- 상품의 가격이 올바르지 않으면 등록할 수 없다.
    - 상품의 가격은 0원 이상이어야 한다.
- 상품의 이름이 올바르지 않으면 등록할 수 없다.
    - 상품의 이름에는 비속어가 포함될 수 없다.
- 상품의 가격을 변경할 수 있다.
- 상품의 가격이 올바르지 않으면 변경할 수 없다.
    - 상품의 가격은 0원 이상이어야 한다.
- 상품의 가격이 변경될 때 메뉴의 가격이 메뉴에 속한 상품 금액의 합보다 크면 메뉴가 숨겨진다.
- 상품의 목록을 조회할 수 있다.

### 메뉴 그룹

- 메뉴 그룹을 등록할 수 있다.
- 메뉴 그룹의 이름이 올바르지 않으면 등록할 수 없다.
    - 메뉴 그룹의 이름은 비워 둘 수 없다.
- 메뉴 그룹의 목록을 조회할 수 있다.

### 메뉴

- 1 개 이상의 등록된 상품으로 메뉴를 등록할 수 있다.
- 상품이 없으면 등록할 수 없다.
- 메뉴에 속한 상품의 수량은 0 이상이어야 한다.
- 메뉴의 가격이 올바르지 않으면 등록할 수 없다.
    - 메뉴의 가격은 0원 이상이어야 한다.
- 메뉴에 속한 상품 금액의 합은 메뉴의 가격보다 크거나 같아야 한다.
- 메뉴는 특정 메뉴 그룹에 속해야 한다.
- 메뉴의 이름이 올바르지 않으면 등록할 수 없다.
    - 메뉴의 이름에는 비속어가 포함될 수 없다.
- 메뉴의 가격을 변경할 수 있다.
- 메뉴의 가격이 올바르지 않으면 변경할 수 없다.
    - 메뉴의 가격은 0원 이상이어야 한다.
- 메뉴에 속한 상품 금액의 합은 메뉴의 가격보다 크거나 같아야 한다.
- 메뉴를 노출할 수 있다.
- 메뉴의 가격이 메뉴에 속한 상품 금액의 합보다 높을 경우 메뉴를 노출할 수 없다.
- 메뉴를 숨길 수 있다.
- 메뉴의 목록을 조회할 수 있다.

### 주문 테이블

- 주문 테이블을 등록할 수 있다.
- 주문 테이블의 이름이 올바르지 않으면 등록할 수 없다.
    - 주문 테이블의 이름은 비워 둘 수 없다.
- 빈 테이블을 해지할 수 있다.
- 빈 테이블로 설정할 수 있다.
- 완료되지 않은 주문이 있는 주문 테이블은 빈 테이블로 설정할 수 없다.
- 방문한 손님 수를 변경할 수 있다.
- 방문한 손님 수가 올바르지 않으면 변경할 수 없다.
    - 방문한 손님 수는 0 이상이어야 한다.
- 빈 테이블은 방문한 손님 수를 변경할 수 없다.
- 주문 테이블의 목록을 조회할 수 있다.

### 주문

- 1개 이상의 등록된 메뉴로 배달 주문을 등록할 수 있다.
- 1개 이상의 등록된 메뉴로 포장 주문을 등록할 수 있다.
- 1개 이상의 등록된 메뉴로 매장 주문을 등록할 수 있다.
- 주문 유형이 올바르지 않으면 등록할 수 없다.
- 메뉴가 없으면 등록할 수 없다.
- 매장 주문은 주문 항목의 수량이 0 미만일 수 있다.
- 매장 주문을 제외한 주문의 경우 주문 항목의 수량은 0 이상이어야 한다.
- 배달 주소가 올바르지 않으면 배달 주문을 등록할 수 없다.
    - 배달 주소는 비워 둘 수 없다.
- 빈 테이블에는 매장 주문을 등록할 수 없다.
- 숨겨진 메뉴는 주문할 수 없다.
- 주문한 메뉴의 가격은 실제 메뉴 가격과 일치해야 한다.
- 주문을 접수한다.
- 접수 대기 중인 주문만 접수할 수 있다.
- 배달 주문을 접수되면 배달 대행사를 호출한다.
- 주문을 서빙한다.
- 접수된 주문만 서빙할 수 있다.
- 주문을 배달한다.
- 배달 주문만 배달할 수 있다.
- 서빙된 주문만 배달할 수 있다.
- 주문을 배달 완료한다.
- 배달 중인 주문만 배달 완료할 수 있다.
- 주문을 완료한다.
- 배달 주문의 경우 배달 완료된 주문만 완료할 수 있다.
- 포장 및 매장 주문의 경우 서빙된 주문만 완료할 수 있다.
- 주문 테이블의 모든 매장 주문이 완료되면 빈 테이블로 설정한다.
- 완료되지 않은 매장 주문이 있는 주문 테이블은 빈 테이블로 설정하지 않는다.
- 주문 목록을 조회할 수 있다.

## 용어 사전
### 공통
| 한글명   | 영문명              | 설명                         |
|-------|------------------|----------------------------|
| 손님    | Guest            | 가게의 메뉴들을 주문할 수 있는 사람을 말한다. |
| 비속어   | Profanity        | 서비스에서 사용하기에 부적절한 단어를 말한다.  |

### 상품
| 한글명   | 영문명   | 설명                      |
|-------|-------|-------------------------|
| 상품    | Product | 손님에게 제공할 수 있는 서비스 이다.   |
| 상품 이름 | Name  | 상품의 이름으로 비속어는 포할될 수 없다. |
| 상품 가격 | Price | 상품의 가격으로 0원 이상이다.       |

### 메뉴 그룹
| 한글명      | 영문명       | 설명                           |
|----------|-----------|------------------------------|
| 메뉴 그룹    | MenuGroup | 특정한 목적을 가지고 메뉴들을 묶는 것을 의미한다. |
| 메뉴 그룹 이름 | Name      | 메뉴그룹의 이름을 뜻한다.               |

### 메뉴
| 한글명    | 영문명         | 설명                                                               |
|--------|-------------|------------------------------------------------------------------|
| 메뉴     | Menu        | 손님에게 판매할 수 있는 서비스 정보를 의미한다.                                      |
| 메뉴 이름  | Name        | 메뉴의 이름으로 비속어는 포함될 수 없다.                                          |
| 메뉴 가격  | Price       | 메뉴의 가격으로 0원 이상이다.                                                |
| 메뉴 상품  | MenuProduct | 메뉴를 구성하기 위해 상품에 순서와 개수를 부여한 것이다.      |
| 메뉴 상태  | MenuStatus  | 테이블의 공개가능여부를 상태로 나타낸 것으로 공개, 비공개로 표현한다.                          |
| 메뉴 공개  | Display     | 메뉴를 공개하여 손님이 주문할 수 있는 상태이다.                                      |
| 메뉴 비공개 | Hide        | 메뉴를 비공개하여 손님이 주문할 수 없는 상태이다. 메뉴의 가격이 메뉴상품들의 가격의 합보다 높으면 비공개가 된다. |

### 배달 주문
| 한글명    | 영문명             | 설명                                                                               |
|--------|-----------------|----------------------------------------------------------------------------------|
| 배달 주문  | DeliveryOrder   | 손님이 제공받길 원하는 메뉴들을 배달로 받기를 원하는 요청을 의미한다.                                          |
| 주문 항목  | OrderLineItem   | 손님이 주문한 메뉴에 대한 정보를 의미한다.                                                         |
| 주문 상태  | OrderStatus     | 손님이 주문한 메뉴들을 접수에서 완료까지의 상태를 표시한다. 대기중, 준비중, 서빙 완료, 배달 시작, 배달 완료, 주문 완료로 구성되어 있다. |
| 주문 시간  | OrderDateTime   | 손님이 주문을 요청한 시간을 말한다.                                                             |
| 배달 주문  | Delivery        | 손님이 배달주소로 음식을 전달해주길 요청하는 유형을 의미한다.                                               |
| 대기중    | Waiting         | 손님이 배달을 요청한 단계로 사장님이 확인하기 전 단계이다.                                                |
| 준비중    | Accepted        | 사장님이 손님의 주문을 확인한 단계로 음식을 준비하는 단계이다.                                              |
| 서빙 완료  | Served          | 사장님이 음식 준비를 완료하여 배달 대행사에 음식을 전달하는 단계이다.                                          |
| 배달 시작  | Delivering      | 배달대행사가 음식을 받아 배달 주소로 배달을 하는 단계이다.                                                |
| 배달 완료  | Delivered       | 배달대행사가 음식을 손님에게 전달 완료한 단계이다.                                                     |
| 주문 완료  | Completed       | 배달대행사가 배달을 완료하여 주문을 종료하는 단계이다.                                                   |
| 배달 주소  | DeliveryAddress | 손님이 주문한 메뉴 항목들을 배달하기 위한 주소를 의미한다.                                                |
| 배달 대행사 | DeliveryAgent   | 배달을 선택한 손님들에게 주문한 메뉴들을 전달해주는 역할을 담당한다.                                           |

### 포장 주문
| 한글명   | 영문명           | 설명                                                                |
|-------|---------------|-------------------------------------------------------------------|
| 주문    | TakeOutOrder  | 손님이 제공받길 원하는 메뉴들을 포장으로 받기를 원하는 요청을 의미한다.                          |
| 주문 항목 | OrderLineItem | 손님이 주문한 메뉴에 대한 정보를 의미한다.                                          |
| 주문 상태 | OrderStatus   | 손님이 주문한 메뉴들을 접수에서 완료까지의 상태를 표시한다. 대기중, 준비중, 서빙 완료, 주문 완료로 구성되어 있다. |
| 주문 시간 | OrderDateTime | 손님이 주문을 요청한 시간을 말한다.                                              |
| 포장 주문 | Takeout       | 손님이 직접 음식을 가지고 가는 유형을 의미한다.                                       |
| 대기중   | Waiting       | 손님이 포장을 요청한 단계로 사장님이 확인하기 전 단계이다.                                 |
| 준비중   | Accepted      | 사장님이 손님의 주문을 확인한 단계로 음식을 준비하는 단계이다.                               |
| 서빙 완료 | Served        | 사장님이 음식 준비를 완료하여 서빙 직원 혹은 사장님이 직접 손님에게 음식을 전달하는 단계이다.             |
| 주문 완료 | Completed     | 음식을 손님에게 서빙되어 주문이 종료되는 단계이다.                                      |


### 매장 주문
| 한글명   | 영문명           | 설명                                                                |
|-------|---------------|-------------------------------------------------------------------|
| 매장 주문 | EatInOrder    | 손님이 제공받길 원하는 메뉴들을 매장에서 식사하기를 원하는 요청을 의미한다.                        |
| 주문 항목 | OrderLineItem | 손님이 주문한 메뉴에 대한 정보를 의미한다.                                          |
| 주문 상태 | OrderStatus   | 손님이 주문한 메뉴들을 접수에서 완료까지의 상태를 표시한다. 대기중, 준비중, 서빙 완료, 주문 완료로 구성되어 있다. |
| 주문 시간 | OrderDateTime | 손님이 주문을 요청한 시간을 말한다.                                              |
| 매장 주문 | EatIn         | 손님이 주문테이블에서 음식을 식사하는 유형을 의미한다.                                    |
| 대기중   | Waiting       | 손님이 매장 식사를 요청한 단계로 사장님이 확인하기 전 단계이다.                              |
| 준비중   | Accepted      | 사장님이 손님의 주문을 확인한 단계로 음식을 준비하는 단계이다.                               |
| 서빙 완료 | Served        | 사장님이 음식 준비를 완료하여 서빙 직원 혹은 사장님이 직접 손님에게 음식을 전달하는 단계이다.             |
| 주문 완료 | Completed     | 음식을 손님에게 서빙되어 주문이 종료되는 단계이다.                                      |


### 주문테이블
| 한글명       | 영문명            | 설명                                          |
|-----------|----------------|---------------------------------------------|
| 주문 테이블    | OrderTable     | 손님이 매장 주문시 사용할 수 있는 테이블을 의미한다.              |
| 주문 테이블 이름 | Name           | 주문 테이블의 이름이다.                               |
| 방문한 손님 수  | NumberOfGuests | 특정 주문테이블을 사용중인 1명이상의 손님 수를 의미한다.            |
| 테이블 상태    | TableStatus    | 테이블의 사용가능여부를 상태로 나타낸 것으로 사용중, 비어있음 으로 표현한다. |
| 테이블 사용중   | Sit            | 테이블을 손님이 사용중인 상태를 말한다.                      |
| 테이블 비어있음  | Clear          | 테이블에 손님이 없는 상태를 말한다.                        |

## 모델링

## 상품

### 상품
- `Product`는 식별자와 `Name`, `Price`을 가진다.
- `Price`는 0원 이상이어야 한다.
- `Price`는 변경될 수 있다.
- `Name`은 `Profanity`이 없는 1글자 이상의 단어가 필요하다.

## 메뉴

### 메뉴그룹
- `MenuGroup`은 식별자와 `Name`을 가진다.
- `Name`은 1글자 이상이어야 한다.

### 메뉴
- `Menu`는 식별자와 `Name`, `Price`, `MenuGroup`, `MenuProduct`, `MenuStatus`을 가진다.
- `MenuGroup`이 필요하다.
- `Name`은 `Profanity`이 없는 1글자 이상의 단어가 필요하다.
- `Price`는 0원 이상이어야 하고 변경될 수 있다.
  - `MenuProduct`들의 가격의 합보다 작아야 한다.
- `Menu`는 `MenuProduct`가 1개 이상 필요하다.
- `MenuProduct`는 순서를 가질 수 있고 개수는 0개 이상이어야 한다.
- `MenuStatus`에는 `Display`와 `Hide`가 있고 상태를 수정할 수 있다.


### 배달 주문
- `Delivery`는 식별자와 `OrderStatus`, `OrderDateTime`, `OrderLineItem`, `Delivery Address`를 가진다.
- `OrderStatus`는 `Waiting`에서 시작한다.
- `DeliveryAddress`가 필요하다.
- `OrderLineItem`이 1개 이상 필요하다.
  - `OrderLineItem`는 순서를 가질 수 있고 0개 이상 필요하다.
- `OrderStatus`는 `Waiting` -> `Accepted` -> `Served` -> `Delivering` -> `Delivered` -> `Complete`로 변경된다.
  - 사장이 `Waiting` 상태의 주문을 확인하고 `DeliveryAgent`에게 배달 요청을 해야 `Accepted`상태가 된다.
  - `DeliveryAgent`에게 음식을 서빙하면 `Served`상태가 된다.
  - `DeliveryAgent`가 `DeliveryAddress`로 배달을 시작하면 `Delivering` 상태가 된다.
  - `DeliveryAgent`가 고객에게 배달을 완료하면 `Delivered`상태가 된다.
  - 주문 상태는 최종적으로 `Complete` 상태가 된다.

### 포장 주문
- `Takeout`는 식별자와 `OrderStatus`, `OrderDateTime`, `OrderLineItem`를 가진다.
- `OrderStatus`는 `Waiting`에서 시작한다.
- `OrderLineItem`이 1개 이상 필요하다.
  - `OrderLineItem`는 순서를 가질 수 있고 0개 이상 필요하다.
- `OrderStatus`는 `Waiting` -> `Accepted` -> `Served` -> `Complete`로 변경된다.
  - 사장이 `Waiting`상태의 주문을 확인하면 `OrderStatus`가 `Accepted`상태가 된다.
  - 고객에게 전달할 음식이 준비가 다 되었으면 `Served` 상태가 된다.
  - 주문 상태는 최종적으로 `Complete` 상태가 된다.

### 매장 주문
- `EatInOrder`는 식별자와 `OrderStatus`, `OrderDateTime`, `OrderLineItem`, `OrderTable`을 가진다.
- `OrderStatus`는 `Waiting`에서 시작한다.
- `OrderLineItem`이 1개 이상 필요하다.
  - `OrderLineItem`는 순서를 가질 수 있고 0개 이상 필요하다.
- `OrderTable`이 필요하다
  - `TableStatus`가 `clear`인 `OrderTable`에서만 주문을 생성할 수 있다.
- `OrderStatus`는 `Waiting` -> `Accepted` -> `Served` -> `Complete`로 변경된다.
  - 사장이 `Waiting`상태의 주문을 확인하면 `OrderStatus`가 `Accepted`상태가 된다.
  - 고객에게 전달할 음식이 준비가 다 되었으면 `Served` 상태가 된다.
  - 주문 상태는 최종적으로 `Complete` 상태가 된다.
    - 주문이 완료된 `OrderTable`은 `NumberOfGuest`가 0이고 `Clear`상태의 테이블이 된다.

### 주문테이블
- `OrderTable`은 식별자와 `Name`, `NumberOfGuests`, `TableStatus`를 가진다.
- `Name`은 1글자 이상의 단어가 필요하다.
- `TableStatus`는 `Sit`, `Clear`가 있고 상태를 수정할 수 있다.
  - `OrderTable`에 `OrderStatus`가 `Complete`가 아닌 주문이 남아 있다면, `Clear`할 수 없다.
- `OrderTable`에 있는 `NumberOfGuest`는 변경이 가능하다.
  - `TableStatus`가 `Sit`일 경우에 변경이 가능하다.
  - `NumberOfGuests`를 변경 시, 0명이상이 필요하다.
