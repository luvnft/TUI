import 'gift_localizations.dart';

/// The translations for English (`en`).
class GiftLocalizationsEn extends GiftLocalizations {
  GiftLocalizationsEn([String locale = 'en']) : super(locale);

  @override
  String get gift_send => 'Send';

  @override
  String get gift_text => 'Gift';

  @override
  String get gift_send_give => '&#160;sent&#160;';

  @override
  String get livekit_gift_me => 'Me';
}
