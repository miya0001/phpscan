# TODO

* 除外するPHPファイルのパスが多い場合にも動作が遅くならないようにする。
* extract($r, EXTR_SKIP);の動作を再現する。
* includeファイルが見つからない場合に、ファイル名の条件をもとにファイルを見つけられるようにする。
* Symfony, Cakeのフレームワークに対応する。
* マルチスレッドで実行できるようにする。
* 条件が常にtrue/falseの場合は、if文で特定パスだけを実行するようにする。
* magic_quotes_gpcに対応する。
* preg_replaceの前方参照の動作を再現する。
* preg_replaceで置換された文字の種類を考慮して検査する。
* $_FILES["file"]["tmp_name"]はユーザ入力値でないが、ファイル内容はユーザ入力値であることを考慮して検査する。
* if(is_numeric($xxx))の場合、変数が数値であることを考慮して検査する。
* 関数の機能を抽象化してキャッシュしておき、2回目以降は実行しなくてもよいようにする。
* PHP7の機能に対応する。
