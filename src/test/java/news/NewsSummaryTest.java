package news;

import static org.assertj.core.api.Assertions.assertThat;

import java.util.Date;
import nss.NewsSummary;
import org.junit.jupiter.api.Test;

class NewsSummaryTest {
  @Test
  void testContentWithoutURIs() {
    var sut =
        new NewsSummary(
            """
四国で9日夜、大規模な停電が発生し、最大で28万戸が停電しました。四国電力の発表によると、午後9時40分には復旧し、停電件数は10戸未満となっています。

<uri>http://www3.nhk.or.jp/news/html/20241109/k10014634061000.html</uri>

フィギュアスケートのNHK杯では、女子シングルで坂本花織選手が優勝し、千葉百音選手が2位、青木祐奈選手が3位と日本勢が上位を独占しました。また、男子シングルでは鍵山優真選手が大会連覇を果たしました。

<uri>http://www3.nhk.or.jp/news/html/20241109/k10014632631000.html</uri>

""",
            new Date());
    assertThat(sut.contentWithoutURIs())
        .isEqualTo(
            """
四国で9日夜、大規模な停電が発生し、最大で28万戸が停電しました。四国電力の発表によると、午後9時40分には復旧し、停電件数は10戸未満となっています。



フィギュアスケートのNHK杯では、女子シングルで坂本花織選手が優勝し、千葉百音選手が2位、青木祐奈選手が3位と日本勢が上位を独占しました。また、男子シングルでは鍵山優真選手が大会連覇を果たしました。



""");
  }
}
