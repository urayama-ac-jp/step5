# 【第5回】フレームワークを使ったプログラミング
## テーマ
1. CSSフレームワーク「Bootstrap」を使用してWEBページを装飾する

## 開発環境について
* この演習では、Codespacesと呼ばれるサービスを使って開発を行います。
* ブラウザ上で動作する開発環境です、インストール不要で使う事ができます。

## Codespacesで実行してみよう
* 第一回で実施した[手順](/Codespacesの実行手順.md)を参照してください。

## CSSフレームワーク「Bootstrap」を使用してWEBページへの装飾追加を学習
1. `Let's try!`を押します。<br>
![image](https://user-images.githubusercontent.com/32722128/154497152-42933475-5dcd-44eb-9dee-e16771e3de54.png)

2. 学生の一覧が表示される事を確認しましょう。<br>
![image](https://user-images.githubusercontent.com/32722128/154497235-3b99470c-a5b7-44a3-8117-c9a119bdaba5.png)

3. 確認が終わったら、タブを閉じましょう<br>
![image](https://user-images.githubusercontent.com/32722128/150733257-a1056c19-1b24-412b-8bfc-a6063e75c785.png)

4. デバック実行中ですので、停止ボタンを押して、デバック実行を停止しましょう。<br>
![image](https://user-images.githubusercontent.com/32722128/150748527-d7121765-5142-4f5a-9769-33c0c23627a4.png)

## 解説
### CSSとは
* CSSはWEBページを装飾するための言語です。 
* CSSによってWEBページの文字の色やサイズ、背景色、レイアウト、余白の調整などが行えます。  
* 例えば以下のようにHTMLを記述します。  
```
<html>

<head>
  <style>
    .akamoji {
    color: red;
    }
  </style>
</head>

<body>
  <main>
    <p>ふつう</p>
    <p class="akamoji">あかくなる</p>
  </main>
</body>

</html>
```
下記は、「akamoji」とclass属性が指定されているHTMLタグの文字列の色を赤色にするためのCSSです。
```
.akamoji {
  color: red;
}
```
以下のpタグ内の文字列を赤くします。
```
<p class="akamoji">あかくなる</p>
```
表示結果<br>
![image](https://user-images.githubusercontent.com/32722128/154493657-e5c7be73-5575-4bca-a939-1d9f4b09e5e8.png)

* 見栄えの良いWEBページに仕上げるためには、このようなCSSのコードを沢山記述する必要があります。
* 以下で紹介するBootstrapのようなCSSフレームワークを使用する事でCSSをあまり記載する事なく、WEBページを装飾することが出来ます。

### Bootstrapとは
* Twitter社の開発した、CSSフレームワークです、Webページの基本機能として使用される「メニュー」「ボタン」「フォーム」などのパーツがテンプレートで用意されており、それらを呼び出すだけで簡単に見栄えのいいWEBページを作成することが出来ます。
* Bootstrapを利用するには、Bootstrapが提供するcssを記載したファイルと、JavaScriptファイルを読み込む必要があります。
* `<head>`タグ内に外部ファイル参照の形式でCSSファイルを読み込む指定をします。
```
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC" crossorigin="anonymous">
```
* ページの最後の `</body>` タグの直前に外部ファイル参照の形式でJavaScriptファイルを読み込む指定をします。
```
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/js/bootstrap.bundle.min.js" integrity="sha384-MrcW6ZMFYlzcLA8Nl+NtUVF0sA7MsXsP1UyJoMp4YLEuNSfAP+JcXn/tWtIaxVXM" crossorigin="anonymous"></script>
```
* CSSファイル、JavaScriptファイルは自分達のサーバーに配置する事も出来ますが、今回はCDNサーバ上のファイルを使用します。
* 以下のように、class属性やscope属性にBootstrapが指定する値`table table-dark`などを指定する事で、CSSを自ら記述する事なくスタイルを適用する事が出来ます。
```
<table class="table table-dark">
  <thead>
    <tr>
      <th scope="col">学籍番号</th>
      <th scope="col">名前</th>
      <th scope="col">所属学科</th>
    </tr>
  </thead>
  <tbody>
    <tr scope="row" th:each="student : ${studentList}">
      <td th:text="${student.id}"></td>
      <td th:text="${student.name}"></td>
      <td th:text="${student.department}"></td>
    </tr>
  </tbody>
</table>
```

## 演習level1 step5
1. STEP-5のページを開きます。<br>
以下のようにテーブルの行を一行ごとに色を変えて見やすくしましょう。
![image](https://user-images.githubusercontent.com/32722128/154498162-aacb3e84-e18a-422f-a57c-bbc0908dcdc8.png)


## ヒント
1. tableタグのclass属性に値を追加しましょう。 
* 編集先:`~/src/main/resources/templates/step5/index.html`

2. どのクラスを適用すれば良いかBootstrapの公式ドキュメントから探してみましょう。
* URL:https://getbootstrap.jp/docs/5.0/content/tables/

## テスト
* 提出前に回答があっているかテストしてみましょう。

1. `~/src/test/java/com/classroom/assignment/controller/api/Step5ControllerTests.java`を開きます。

2. クラス名の前の再生ボタンをクリックします。(画面コピーは一度テスト実施済みのためチェックマークに変わっています。)
![image](https://user-images.githubusercontent.com/32722128/154556241-57ceb1ff-2cae-4603-bd1a-8ad920c52663.png)

3. 再生ボタンがチェックマークに変わればテスト成功です！

## 課題の提出
* 課題の提出は第一回と同じ[操作](/課題の提出手順.md)のコミット・プッシュ・プルリクエストを実施しましょう。
