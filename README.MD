### テストコードの書き方

Junit5で生成する

https://oohira.github.io/junit5-doc-jp/user-guide/

### テストコードの作成方法

Intellijの場合、クラスを右クリックして、ShowContextAreaにて生成可能。

### テストコードでやるべきこと

サービスクラス単位でロジック記載する。以下のようにサービスクラスをインスタンス化する。

```java
@BeforeEach
void setUp() {
  test = new ServiceTest();
}
```

### テストコード並びにカバレッジ確認方法

テストコードの実行とカバレッジは、テストクラスの左にある再生ボタンを押す。

カバレッジまで確認したい場合、盾マークのwith coverageを選択する





