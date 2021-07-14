package com.onenetwork.constant;

import com.onenetwork.model.ControlIdentifierSelector;
import com.onenetwork.model.ae_ax.cw.CW02RecordDataElement;
import com.onenetwork.model.ae_ax.e0.E0RecordDataElement;
import com.onenetwork.model.ae_ax.e1.E1RecordDataElement;
import com.onenetwork.model.ae_ax.numbers.EightyEightDataElement;
import com.onenetwork.model.ae_ax.numbers.EightyNineDataElement;
import com.onenetwork.model.ae_ax.numbers.ElevenRecordDataElement;
import com.onenetwork.model.ae_ax.numbers.FiftyFourRecordDataElement;
import com.onenetwork.model.ae_ax.numbers.FiftyOneRecordDataElement;
import com.onenetwork.model.ae_ax.numbers.FiftyRecordDataElement;
import com.onenetwork.model.ae_ax.numbers.FiftyThreeRecordDataElement;
import com.onenetwork.model.ae_ax.numbers.FiftyTwoRecordDataElement;
import com.onenetwork.model.ae_ax.numbers.FortyFourRecordDataElement;
import com.onenetwork.model.ae_ax.numbers.FortyOneRecordDataElement;
import com.onenetwork.model.ae_ax.numbers.FortyRecordDataElement;
import com.onenetwork.model.ae_ax.numbers.FortySevenRecordDataElement;
import com.onenetwork.model.ae_ax.numbers.FortyThreeRecordDataElement;
import com.onenetwork.model.ae_ax.numbers.FortyTwoRecordDataElement;
import com.onenetwork.model.ae_ax.numbers.NinetyDataElement;
import com.onenetwork.model.ae_ax.numbers.SixtyOneRecordDataElement;
import com.onenetwork.model.ae_ax.numbers.SixtyRecordDataElement;
import com.onenetwork.model.ae_ax.numbers.SixtyThreeRecordDataElement;
import com.onenetwork.model.ae_ax.numbers.SixtyTwoRecordDataElement;
import com.onenetwork.model.ae_ax.numbers.TenRecordDataElement;
import com.onenetwork.model.ae_ax.numbers.ThirtyFiveRecordDataElement;
import com.onenetwork.model.ae_ax.numbers.ThirtyFourRecordDataElement;
import com.onenetwork.model.ae_ax.numbers.ThirtyOneRecordDataElement;
import com.onenetwork.model.ae_ax.numbers.ThirtyRecordDataElement;
import com.onenetwork.model.ae_ax.numbers.ThirtySixRecordDataElement;
import com.onenetwork.model.ae_ax.numbers.ThirtyThreeRecordDataElement;
import com.onenetwork.model.ae_ax.numbers.ThirtyTwoRecordDataElement;
import com.onenetwork.model.ae_ax.numbers.TwentyOneRecordDataElement;
import com.onenetwork.model.ae_ax.numbers.TwentyRecordDataElement;
import com.onenetwork.model.ae_ax.numbers.TwentyThreeRecordDataElement;
import com.onenetwork.model.ae_ax.numbers.TwentyTwoRecordDataElement;
import com.onenetwork.model.ae_ax.oi.OIRecordDataElement;
import com.onenetwork.model.ae_ax.se.SE13RecordDataElement;
import com.onenetwork.model.ae_ax.se.SE16RecordDataElement;
import com.onenetwork.model.ae_ax.se.SE17RecordDataElement;
import com.onenetwork.model.ae_ax.se.SE20RecordDataElement;
import com.onenetwork.model.ae_ax.se.SE30RecordDataElement;
import com.onenetwork.model.ae_ax.se.SE35RecordDataElement;
import com.onenetwork.model.ae_ax.se.SE36RecordDataElement;
import com.onenetwork.model.ae_ax.se.SE50RecordDataElement;
import com.onenetwork.model.ae_ax.se.SE55RecordDataElement;
import com.onenetwork.model.ae_ax.se.SE56RecordDataElement;
import com.onenetwork.model.ae_ax.se.SE61RecordDataElement;
import com.onenetwork.model.nr.N1RecordDataElement;
import com.onenetwork.model.nr.N2RecordDataElement;
import com.onenetwork.model.nr.N3RecordDataElement;
import com.onenetwork.model.nr.N4RecordDataElement;
import com.onenetwork.model.sa.SA10RecordDataElement;
import com.onenetwork.model.sa.SA20RecordDataElement;
import com.onenetwork.model.sa.SA30RecordDataElement;
import com.onenetwork.model.sa.SA50RecordDataElement;
import com.onenetwork.model.sn_us_isf10.SF13RecordDataElement;
import com.onenetwork.model.sn_us_isf10.SF15RecordDataElement;
import com.onenetwork.model.sn_us_isf10.SF40RecordDataElement;
import com.onenetwork.model.sn_us_isf10.SF50RecordDataElement;
import com.onenetwork.model.sn_us_isf10.SF90RecordDataElement;
import com.onenetwork.model.so.SO10RecordDataElement;
import com.onenetwork.model.so.SO20RecordDataElement;
import com.onenetwork.model.so.SO30RecordDataElement;
import com.onenetwork.model.so.SO40RecordDataElement;
import com.onenetwork.model.so.SO42RecordDataElement;
import com.onenetwork.model.so.SO50RecordDataElement;
import com.onenetwork.model.so.SO60RecordDataElement;
import com.onenetwork.model.so.SO70RecordDataElement;
import com.onenetwork.model.so.SO71RecordDataElement;
import com.onenetwork.model.so.SO72RecordDataElement;
import com.onenetwork.model.sx.se.SE10RecordDataElement;
import com.onenetwork.model.sx.se.SE11RecordDataElement;
import com.onenetwork.model.sx.se.SE15RecordDataElement;
import com.onenetwork.model.sx.se.SE40RecordDataElement;
import com.onenetwork.model.sx.se.SE41RecordDataElement;
import com.onenetwork.model.sx.se.SE60RecordDataElement;
import com.onenetwork.model.sx.se.SE90RecordDataElement;
import com.onenetwork.model.sx.sf.SF10RecordDataElement;
import com.onenetwork.model.sx.sf.SF20RecordDataElement;
import com.onenetwork.model.sx.sf.SF25RecordDataElement;
import com.onenetwork.model.sx.sf.SF30RecordDataElement;
import com.onenetwork.model.sx.sf.SF31RecordDataElement;
import com.onenetwork.model.sx.sf.SF35RecordDataElement;
import com.onenetwork.model.sx.sf.SF36RecordDataElement;
import com.onenetwork.parser.AnnotationParser;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.function.Function;

import static com.onenetwork.constant.TypeConstant.TYPE_AE;
import static com.onenetwork.constant.TypeConstant.TYPE_AX;
import static com.onenetwork.constant.TypeConstant.TYPE_NR;
import static com.onenetwork.constant.TypeConstant.TYPE_SA;
import static com.onenetwork.constant.TypeConstant.TYPE_SN;
import static com.onenetwork.constant.TypeConstant.TYPE_SO;
import static com.onenetwork.constant.TypeConstant.TYPE_SX;
import static com.onenetwork.constant.TypeConstant.TYPE_US_ISF10;
import static com.onenetwork.model.ControlIdentifier.CW02;
import static com.onenetwork.model.ControlIdentifier.E0;
import static com.onenetwork.model.ControlIdentifier.E1;
import static com.onenetwork.model.ControlIdentifier.EIGHTY_EIGHT;
import static com.onenetwork.model.ControlIdentifier.EIGHTY_NINE;
import static com.onenetwork.model.ControlIdentifier.ELEVEN;
import static com.onenetwork.model.ControlIdentifier.FIFTY;
import static com.onenetwork.model.ControlIdentifier.FIFTY_FOUR;
import static com.onenetwork.model.ControlIdentifier.FIFTY_ONE;
import static com.onenetwork.model.ControlIdentifier.FIFTY_THREE;
import static com.onenetwork.model.ControlIdentifier.FIFTY_TWO;
import static com.onenetwork.model.ControlIdentifier.FORTY;
import static com.onenetwork.model.ControlIdentifier.FORTY_FOUR;
import static com.onenetwork.model.ControlIdentifier.FORTY_ONE;
import static com.onenetwork.model.ControlIdentifier.FORTY_SEVEN;
import static com.onenetwork.model.ControlIdentifier.FORTY_THREE;
import static com.onenetwork.model.ControlIdentifier.FORTY_TWO;
import static com.onenetwork.model.ControlIdentifier.N1;
import static com.onenetwork.model.ControlIdentifier.N2;
import static com.onenetwork.model.ControlIdentifier.N3;
import static com.onenetwork.model.ControlIdentifier.N4;
import static com.onenetwork.model.ControlIdentifier.NINETY;
import static com.onenetwork.model.ControlIdentifier.OI;
import static com.onenetwork.model.ControlIdentifier.SA10;
import static com.onenetwork.model.ControlIdentifier.SA20;
import static com.onenetwork.model.ControlIdentifier.SA30;
import static com.onenetwork.model.ControlIdentifier.SA50;
import static com.onenetwork.model.ControlIdentifier.SE10;
import static com.onenetwork.model.ControlIdentifier.SE11;
import static com.onenetwork.model.ControlIdentifier.SE13;
import static com.onenetwork.model.ControlIdentifier.SE15;
import static com.onenetwork.model.ControlIdentifier.SE16;
import static com.onenetwork.model.ControlIdentifier.SE17;
import static com.onenetwork.model.ControlIdentifier.SE20;
import static com.onenetwork.model.ControlIdentifier.SE30;
import static com.onenetwork.model.ControlIdentifier.SE35;
import static com.onenetwork.model.ControlIdentifier.SE36;
import static com.onenetwork.model.ControlIdentifier.SE40;
import static com.onenetwork.model.ControlIdentifier.SE41;
import static com.onenetwork.model.ControlIdentifier.SE50;
import static com.onenetwork.model.ControlIdentifier.SE55;
import static com.onenetwork.model.ControlIdentifier.SE56;
import static com.onenetwork.model.ControlIdentifier.SE60;
import static com.onenetwork.model.ControlIdentifier.SE61;
import static com.onenetwork.model.ControlIdentifier.SE90;
import static com.onenetwork.model.ControlIdentifier.SF10;
import static com.onenetwork.model.ControlIdentifier.SF13;
import static com.onenetwork.model.ControlIdentifier.SF15;
import static com.onenetwork.model.ControlIdentifier.SF20;
import static com.onenetwork.model.ControlIdentifier.SF25;
import static com.onenetwork.model.ControlIdentifier.SF30;
import static com.onenetwork.model.ControlIdentifier.SF31;
import static com.onenetwork.model.ControlIdentifier.SF35;
import static com.onenetwork.model.ControlIdentifier.SF36;
import static com.onenetwork.model.ControlIdentifier.SF40;
import static com.onenetwork.model.ControlIdentifier.SF50;
import static com.onenetwork.model.ControlIdentifier.SF90;
import static com.onenetwork.model.ControlIdentifier.SIXTY;
import static com.onenetwork.model.ControlIdentifier.SIXTY_ONE;
import static com.onenetwork.model.ControlIdentifier.SIXTY_THREE;
import static com.onenetwork.model.ControlIdentifier.SIXTY_TWO;
import static com.onenetwork.model.ControlIdentifier.SO10;
import static com.onenetwork.model.ControlIdentifier.SO20;
import static com.onenetwork.model.ControlIdentifier.SO30;
import static com.onenetwork.model.ControlIdentifier.SO40;
import static com.onenetwork.model.ControlIdentifier.SO42;
import static com.onenetwork.model.ControlIdentifier.SO50;
import static com.onenetwork.model.ControlIdentifier.SO60;
import static com.onenetwork.model.ControlIdentifier.SO70;
import static com.onenetwork.model.ControlIdentifier.SO71;
import static com.onenetwork.model.ControlIdentifier.SO72;
import static com.onenetwork.model.ControlIdentifier.TEN;
import static com.onenetwork.model.ControlIdentifier.THIRTY;
import static com.onenetwork.model.ControlIdentifier.THIRTY_FIVE;
import static com.onenetwork.model.ControlIdentifier.THIRTY_FOUR;
import static com.onenetwork.model.ControlIdentifier.THIRTY_ONE;
import static com.onenetwork.model.ControlIdentifier.THIRTY_SIX;
import static com.onenetwork.model.ControlIdentifier.THIRTY_THREE;
import static com.onenetwork.model.ControlIdentifier.THIRTY_TWO;
import static com.onenetwork.model.ControlIdentifier.TWENTY;
import static com.onenetwork.model.ControlIdentifier.TWENTY_ONE;
import static com.onenetwork.model.ControlIdentifier.TWENTY_THREE;
import static com.onenetwork.model.ControlIdentifier.TWENTY_TWO;

public class PreparedRecordDataElement {

    private static final Map<ControlIdentifierSelector, Function<String, Object>> SERVICE_RECORD_DATA_ELEMENT =
            new HashMap<>(1000);

    static {
        SERVICE_RECORD_DATA_ELEMENT.put(new ControlIdentifierSelector(TYPE_AE, E0.getIdentifier()), e -> {
            String refType = e.substring(3, 9);
            return AnnotationParser.getParsedValue(E0RecordDataElement.class, e, refType);
        });
        SERVICE_RECORD_DATA_ELEMENT.put(new ControlIdentifierSelector(TYPE_AE, EIGHTY_EIGHT.getIdentifier()),
                e -> AnnotationParser.getParsedValue(EightyEightDataElement.class, e, null));
        SERVICE_RECORD_DATA_ELEMENT.put(new ControlIdentifierSelector(TYPE_AE, EIGHTY_NINE.getIdentifier()),
                e -> AnnotationParser.getParsedValue(EightyNineDataElement.class, e, null));
        SERVICE_RECORD_DATA_ELEMENT.put(new ControlIdentifierSelector(TYPE_AE, ELEVEN.getIdentifier()),
                e -> AnnotationParser.getParsedValue(ElevenRecordDataElement.class, e, null));
        SERVICE_RECORD_DATA_ELEMENT.put(new ControlIdentifierSelector(TYPE_AE, FIFTY_FOUR.getIdentifier()),
                e -> AnnotationParser.getParsedValue(FiftyFourRecordDataElement.class, e, null));
        SERVICE_RECORD_DATA_ELEMENT.put(new ControlIdentifierSelector(TYPE_AE, FIFTY_ONE.getIdentifier()),
                e -> AnnotationParser.getParsedValue(FiftyOneRecordDataElement.class, e, null));
        SERVICE_RECORD_DATA_ELEMENT.put(new ControlIdentifierSelector(TYPE_AE, FIFTY.getIdentifier()),
                e -> AnnotationParser.getParsedValue(FiftyRecordDataElement.class, e, null));
        SERVICE_RECORD_DATA_ELEMENT.put(new ControlIdentifierSelector(TYPE_AE, FIFTY_THREE.getIdentifier()),
                e -> AnnotationParser.getParsedValue(FiftyThreeRecordDataElement.class, e, null));
        SERVICE_RECORD_DATA_ELEMENT.put(new ControlIdentifierSelector(TYPE_AE, FIFTY_TWO.getIdentifier()),
                e -> AnnotationParser.getParsedValue(FiftyTwoRecordDataElement.class, e, null));
        SERVICE_RECORD_DATA_ELEMENT.put(new ControlIdentifierSelector(TYPE_AE, FORTY_FOUR.getIdentifier()),
                e -> AnnotationParser.getParsedValue(FortyFourRecordDataElement.class, e, null));
        SERVICE_RECORD_DATA_ELEMENT.put(new ControlIdentifierSelector(TYPE_AE, FORTY_ONE.getIdentifier()),
                e -> AnnotationParser.getParsedValue(FortyOneRecordDataElement.class, e, null));
        SERVICE_RECORD_DATA_ELEMENT.put(new ControlIdentifierSelector(TYPE_AE, FORTY.getIdentifier()),
                e -> AnnotationParser.getParsedValue(FortyRecordDataElement.class, e, null));
        SERVICE_RECORD_DATA_ELEMENT.put(new ControlIdentifierSelector(TYPE_AE, FORTY_SEVEN.getIdentifier()),
                e -> AnnotationParser.getParsedValue(FortySevenRecordDataElement.class, e, null));
        SERVICE_RECORD_DATA_ELEMENT.put(new ControlIdentifierSelector(TYPE_AE, FORTY_THREE.getIdentifier()),
                e -> AnnotationParser.getParsedValue(FortyThreeRecordDataElement.class, e, null));
        SERVICE_RECORD_DATA_ELEMENT.put(new ControlIdentifierSelector(TYPE_AE, FORTY_TWO.getIdentifier()),
                e -> AnnotationParser.getParsedValue(FortyTwoRecordDataElement.class, e, null));
        SERVICE_RECORD_DATA_ELEMENT.put(new ControlIdentifierSelector(TYPE_AE, NINETY.getIdentifier()),
                e -> AnnotationParser.getParsedValue(NinetyDataElement.class, e, null));
        SERVICE_RECORD_DATA_ELEMENT.put(new ControlIdentifierSelector(TYPE_AE, SIXTY_ONE.getIdentifier()),
                e -> AnnotationParser.getParsedValue(SixtyOneRecordDataElement.class, e, null));
        SERVICE_RECORD_DATA_ELEMENT.put(new ControlIdentifierSelector(TYPE_AE, SIXTY.getIdentifier()),
                e -> AnnotationParser.getParsedValue(SixtyRecordDataElement.class, e, null));
        SERVICE_RECORD_DATA_ELEMENT.put(new ControlIdentifierSelector(TYPE_AE, SIXTY_THREE.getIdentifier()),
                e -> AnnotationParser.getParsedValue(SixtyThreeRecordDataElement.class, e, null));
        SERVICE_RECORD_DATA_ELEMENT.put(new ControlIdentifierSelector(TYPE_AE, SIXTY_TWO.getIdentifier()),
                e -> AnnotationParser.getParsedValue(SixtyTwoRecordDataElement.class, e, null));
        SERVICE_RECORD_DATA_ELEMENT.put(new ControlIdentifierSelector(TYPE_AE, TEN.getIdentifier()),
                e -> AnnotationParser.getParsedValue(TenRecordDataElement.class, e, null));
        SERVICE_RECORD_DATA_ELEMENT.put(new ControlIdentifierSelector(TYPE_AE, THIRTY_FIVE.getIdentifier()),
                e -> AnnotationParser.getParsedValue(ThirtyFiveRecordDataElement.class, e, null));
        SERVICE_RECORD_DATA_ELEMENT.put(new ControlIdentifierSelector(TYPE_AE, THIRTY_FOUR.getIdentifier()),
                e -> AnnotationParser.getParsedValue(ThirtyFourRecordDataElement.class, e, null));
        SERVICE_RECORD_DATA_ELEMENT.put(new ControlIdentifierSelector(TYPE_AE, THIRTY_ONE.getIdentifier()),
                e -> AnnotationParser.getParsedValue(ThirtyOneRecordDataElement.class, e, null));
        SERVICE_RECORD_DATA_ELEMENT.put(new ControlIdentifierSelector(TYPE_AE, THIRTY.getIdentifier()),
                e -> AnnotationParser.getParsedValue(ThirtyRecordDataElement.class, e, null));
        SERVICE_RECORD_DATA_ELEMENT.put(new ControlIdentifierSelector(TYPE_AE, THIRTY_SIX.getIdentifier()),
                e -> AnnotationParser.getParsedValue(ThirtySixRecordDataElement.class, e, null));
        SERVICE_RECORD_DATA_ELEMENT.put(new ControlIdentifierSelector(TYPE_AE, THIRTY_THREE.getIdentifier()),
                e -> AnnotationParser.getParsedValue(ThirtyThreeRecordDataElement.class, e, null));
        SERVICE_RECORD_DATA_ELEMENT.put(new ControlIdentifierSelector(TYPE_AE, THIRTY_TWO.getIdentifier()),
                e -> AnnotationParser.getParsedValue(ThirtyTwoRecordDataElement.class, e, null));
        SERVICE_RECORD_DATA_ELEMENT.put(new ControlIdentifierSelector(TYPE_AE, TWENTY_ONE.getIdentifier()),
                e -> AnnotationParser.getParsedValue(TwentyOneRecordDataElement.class, e, null));
        SERVICE_RECORD_DATA_ELEMENT.put(new ControlIdentifierSelector(TYPE_AE, TWENTY.getIdentifier()),
                e -> AnnotationParser.getParsedValue(TwentyRecordDataElement.class, e, null));
        SERVICE_RECORD_DATA_ELEMENT.put(new ControlIdentifierSelector(TYPE_AE, TWENTY_THREE.getIdentifier()),
                e -> AnnotationParser.getParsedValue(TwentyThreeRecordDataElement.class, e, null));
        SERVICE_RECORD_DATA_ELEMENT.put(new ControlIdentifierSelector(TYPE_AE, TWENTY_TWO.getIdentifier()),
                e -> AnnotationParser.getParsedValue(TwentyTwoRecordDataElement.class, e, null));
        SERVICE_RECORD_DATA_ELEMENT.put(new ControlIdentifierSelector(TYPE_AE, CW02.getIdentifier()),
                e -> AnnotationParser.getParsedValue(CW02RecordDataElement.class, e, null));
        SERVICE_RECORD_DATA_ELEMENT.put(new ControlIdentifierSelector(TYPE_AE, E1.getIdentifier()),
                e -> AnnotationParser.getParsedValue(E1RecordDataElement.class, e, null));
        SERVICE_RECORD_DATA_ELEMENT.put(new ControlIdentifierSelector(TYPE_AE, OI.getIdentifier()),
                e -> AnnotationParser.getParsedValue(OIRecordDataElement.class, e, null));
        SERVICE_RECORD_DATA_ELEMENT.put(new ControlIdentifierSelector(TYPE_AE, SE13.getIdentifier()),
                e -> AnnotationParser.getParsedValue(SE13RecordDataElement.class, e, null));
        SERVICE_RECORD_DATA_ELEMENT.put(new ControlIdentifierSelector(TYPE_AE, SE16.getIdentifier()),
                e -> AnnotationParser.getParsedValue(SE16RecordDataElement.class, e, null));
        SERVICE_RECORD_DATA_ELEMENT.put(new ControlIdentifierSelector(TYPE_AE, SE17.getIdentifier()),
                e -> AnnotationParser.getParsedValue(SE17RecordDataElement.class, e, null));
        SERVICE_RECORD_DATA_ELEMENT.put(new ControlIdentifierSelector(TYPE_AE, SE20.getIdentifier()),
                e -> AnnotationParser.getParsedValue(SE20RecordDataElement.class, e, null));
        SERVICE_RECORD_DATA_ELEMENT.put(new ControlIdentifierSelector(TYPE_AE, SE30.getIdentifier()),
                e -> AnnotationParser.getParsedValue(SE30RecordDataElement.class, e, null));
        SERVICE_RECORD_DATA_ELEMENT.put(new ControlIdentifierSelector(TYPE_AE, SE35.getIdentifier()),
                e -> AnnotationParser.getParsedValue(SE35RecordDataElement.class, e, null));
        SERVICE_RECORD_DATA_ELEMENT.put(new ControlIdentifierSelector(TYPE_AE, SE36.getIdentifier()),
                e -> AnnotationParser.getParsedValue(SE36RecordDataElement.class, e, null));
        SERVICE_RECORD_DATA_ELEMENT.put(new ControlIdentifierSelector(TYPE_AE, SE50.getIdentifier()),
                e -> AnnotationParser.getParsedValue(SE50RecordDataElement.class, e, null));
        SERVICE_RECORD_DATA_ELEMENT.put(new ControlIdentifierSelector(TYPE_AE, SE55.getIdentifier()),
                e -> AnnotationParser.getParsedValue(SE55RecordDataElement.class, e, null));
        SERVICE_RECORD_DATA_ELEMENT.put(new ControlIdentifierSelector(TYPE_AE, SE56.getIdentifier()),
                e -> AnnotationParser.getParsedValue(SE56RecordDataElement.class, e, null));
        SERVICE_RECORD_DATA_ELEMENT.put(new ControlIdentifierSelector(TYPE_AE, SE61.getIdentifier()),
                e -> AnnotationParser.getParsedValue(SE61RecordDataElement.class, e, null));

        SERVICE_RECORD_DATA_ELEMENT.put(new ControlIdentifierSelector(TYPE_AX, E0.getIdentifier()), e -> {
            String refType = e.substring(3, 9);
            return AnnotationParser.getParsedValue(E0RecordDataElement.class, e, refType);
        });
        SERVICE_RECORD_DATA_ELEMENT.put(new ControlIdentifierSelector(TYPE_AX, EIGHTY_EIGHT.getIdentifier()),
                e -> AnnotationParser.getParsedValue(EightyEightDataElement.class, e, null));
        SERVICE_RECORD_DATA_ELEMENT.put(new ControlIdentifierSelector(TYPE_AX, EIGHTY_NINE.getIdentifier()),
                e -> AnnotationParser.getParsedValue(EightyNineDataElement.class, e, null));
        SERVICE_RECORD_DATA_ELEMENT.put(new ControlIdentifierSelector(TYPE_AX, ELEVEN.getIdentifier()),
                e -> AnnotationParser.getParsedValue(ElevenRecordDataElement.class, e, null));
        SERVICE_RECORD_DATA_ELEMENT.put(new ControlIdentifierSelector(TYPE_AX, FIFTY_FOUR.getIdentifier()),
                e -> AnnotationParser.getParsedValue(FiftyFourRecordDataElement.class, e, null));
        SERVICE_RECORD_DATA_ELEMENT.put(new ControlIdentifierSelector(TYPE_AX, FIFTY_ONE.getIdentifier()),
                e -> AnnotationParser.getParsedValue(FiftyOneRecordDataElement.class, e, null));
        SERVICE_RECORD_DATA_ELEMENT.put(new ControlIdentifierSelector(TYPE_AX, FIFTY.getIdentifier()),
                e -> AnnotationParser.getParsedValue(FiftyRecordDataElement.class, e, null));
        SERVICE_RECORD_DATA_ELEMENT.put(new ControlIdentifierSelector(TYPE_AX, FIFTY_THREE.getIdentifier()),
                e -> AnnotationParser.getParsedValue(FiftyThreeRecordDataElement.class, e, null));
        SERVICE_RECORD_DATA_ELEMENT.put(new ControlIdentifierSelector(TYPE_AX, FIFTY_TWO.getIdentifier()),
                e -> AnnotationParser.getParsedValue(FiftyTwoRecordDataElement.class, e, null));
        SERVICE_RECORD_DATA_ELEMENT.put(new ControlIdentifierSelector(TYPE_AX, FORTY_FOUR.getIdentifier()),
                e -> AnnotationParser.getParsedValue(FortyFourRecordDataElement.class, e, null));
        SERVICE_RECORD_DATA_ELEMENT.put(new ControlIdentifierSelector(TYPE_AX, FORTY_ONE.getIdentifier()),
                e -> AnnotationParser.getParsedValue(FortyOneRecordDataElement.class, e, null));
        SERVICE_RECORD_DATA_ELEMENT.put(new ControlIdentifierSelector(TYPE_AX, FORTY.getIdentifier()),
                e -> AnnotationParser.getParsedValue(FortyRecordDataElement.class, e, null));
        SERVICE_RECORD_DATA_ELEMENT.put(new ControlIdentifierSelector(TYPE_AX, FORTY_SEVEN.getIdentifier()),
                e -> AnnotationParser.getParsedValue(FortySevenRecordDataElement.class, e, null));
        SERVICE_RECORD_DATA_ELEMENT.put(new ControlIdentifierSelector(TYPE_AX, FORTY_THREE.getIdentifier()),
                e -> AnnotationParser.getParsedValue(FortyThreeRecordDataElement.class, e, null));
        SERVICE_RECORD_DATA_ELEMENT.put(new ControlIdentifierSelector(TYPE_AX, FORTY_TWO.getIdentifier()),
                e -> AnnotationParser.getParsedValue(FortyTwoRecordDataElement.class, e, null));
        SERVICE_RECORD_DATA_ELEMENT.put(new ControlIdentifierSelector(TYPE_AX, NINETY.getIdentifier()),
                e -> AnnotationParser.getParsedValue(NinetyDataElement.class, e, null));
        SERVICE_RECORD_DATA_ELEMENT.put(new ControlIdentifierSelector(TYPE_AX, SIXTY_ONE.getIdentifier()),
                e -> AnnotationParser.getParsedValue(SixtyOneRecordDataElement.class, e, null));
        SERVICE_RECORD_DATA_ELEMENT.put(new ControlIdentifierSelector(TYPE_AX, SIXTY.getIdentifier()),
                e -> AnnotationParser.getParsedValue(SixtyRecordDataElement.class, e, null));
        SERVICE_RECORD_DATA_ELEMENT.put(new ControlIdentifierSelector(TYPE_AX, SIXTY_THREE.getIdentifier()),
                e -> AnnotationParser.getParsedValue(SixtyThreeRecordDataElement.class, e, null));
        SERVICE_RECORD_DATA_ELEMENT.put(new ControlIdentifierSelector(TYPE_AX, SIXTY_TWO.getIdentifier()),
                e -> AnnotationParser.getParsedValue(SixtyTwoRecordDataElement.class, e, null));
        SERVICE_RECORD_DATA_ELEMENT.put(new ControlIdentifierSelector(TYPE_AX, TEN.getIdentifier()),
                e -> AnnotationParser.getParsedValue(TenRecordDataElement.class, e, null));
        SERVICE_RECORD_DATA_ELEMENT.put(new ControlIdentifierSelector(TYPE_AX, THIRTY_FIVE.getIdentifier()),
                e -> AnnotationParser.getParsedValue(ThirtyFiveRecordDataElement.class, e, null));
        SERVICE_RECORD_DATA_ELEMENT.put(new ControlIdentifierSelector(TYPE_AX, THIRTY_FOUR.getIdentifier()),
                e -> AnnotationParser.getParsedValue(ThirtyFourRecordDataElement.class, e, null));
        SERVICE_RECORD_DATA_ELEMENT.put(new ControlIdentifierSelector(TYPE_AX, THIRTY_ONE.getIdentifier()),
                e -> AnnotationParser.getParsedValue(ThirtyOneRecordDataElement.class, e, null));
        SERVICE_RECORD_DATA_ELEMENT.put(new ControlIdentifierSelector(TYPE_AX, THIRTY.getIdentifier()),
                e -> AnnotationParser.getParsedValue(ThirtyRecordDataElement.class, e, null));
        SERVICE_RECORD_DATA_ELEMENT.put(new ControlIdentifierSelector(TYPE_AX, THIRTY_SIX.getIdentifier()),
                e -> AnnotationParser.getParsedValue(ThirtySixRecordDataElement.class, e, null));
        SERVICE_RECORD_DATA_ELEMENT.put(new ControlIdentifierSelector(TYPE_AX, THIRTY_THREE.getIdentifier()),
                e -> AnnotationParser.getParsedValue(ThirtyThreeRecordDataElement.class, e, null));
        SERVICE_RECORD_DATA_ELEMENT.put(new ControlIdentifierSelector(TYPE_AX, THIRTY_TWO.getIdentifier()),
                e -> AnnotationParser.getParsedValue(ThirtyTwoRecordDataElement.class, e, null));
        SERVICE_RECORD_DATA_ELEMENT.put(new ControlIdentifierSelector(TYPE_AX, TWENTY_ONE.getIdentifier()),
                e -> AnnotationParser.getParsedValue(TwentyOneRecordDataElement.class, e, null));
        SERVICE_RECORD_DATA_ELEMENT.put(new ControlIdentifierSelector(TYPE_AX, TWENTY.getIdentifier()),
                e -> AnnotationParser.getParsedValue(TwentyRecordDataElement.class, e, null));
        SERVICE_RECORD_DATA_ELEMENT.put(new ControlIdentifierSelector(TYPE_AX, TWENTY_THREE.getIdentifier()),
                e -> AnnotationParser.getParsedValue(TwentyThreeRecordDataElement.class, e, null));
        SERVICE_RECORD_DATA_ELEMENT.put(new ControlIdentifierSelector(TYPE_AX, TWENTY_TWO.getIdentifier()),
                e -> AnnotationParser.getParsedValue(TwentyTwoRecordDataElement.class, e, null));
        SERVICE_RECORD_DATA_ELEMENT.put(new ControlIdentifierSelector(TYPE_AX, CW02.getIdentifier()),
                e -> AnnotationParser.getParsedValue(CW02RecordDataElement.class, e, null));
        SERVICE_RECORD_DATA_ELEMENT.put(new ControlIdentifierSelector(TYPE_AX, E1.getIdentifier()),
                e -> AnnotationParser.getParsedValue(E1RecordDataElement.class, e, null));
        SERVICE_RECORD_DATA_ELEMENT.put(new ControlIdentifierSelector(TYPE_AX, OI.getIdentifier()),
                e -> AnnotationParser.getParsedValue(OIRecordDataElement.class, e, null));
        SERVICE_RECORD_DATA_ELEMENT.put(new ControlIdentifierSelector(TYPE_AX, SE13.getIdentifier()),
                e -> AnnotationParser.getParsedValue(SE13RecordDataElement.class, e, null));
        SERVICE_RECORD_DATA_ELEMENT.put(new ControlIdentifierSelector(TYPE_AX, SE16.getIdentifier()),
                e -> AnnotationParser.getParsedValue(SE16RecordDataElement.class, e, null));
        SERVICE_RECORD_DATA_ELEMENT.put(new ControlIdentifierSelector(TYPE_AX, SE17.getIdentifier()),
                e -> AnnotationParser.getParsedValue(SE17RecordDataElement.class, e, null));
        SERVICE_RECORD_DATA_ELEMENT.put(new ControlIdentifierSelector(TYPE_AX, SE20.getIdentifier()),
                e -> AnnotationParser.getParsedValue(SE20RecordDataElement.class, e, null));
        SERVICE_RECORD_DATA_ELEMENT.put(new ControlIdentifierSelector(TYPE_AX, SE30.getIdentifier()),
                e -> AnnotationParser.getParsedValue(SE30RecordDataElement.class, e, null));
        SERVICE_RECORD_DATA_ELEMENT.put(new ControlIdentifierSelector(TYPE_AX, SE35.getIdentifier()),
                e -> AnnotationParser.getParsedValue(SE35RecordDataElement.class, e, null));
        SERVICE_RECORD_DATA_ELEMENT.put(new ControlIdentifierSelector(TYPE_AX, SE36.getIdentifier()),
                e -> AnnotationParser.getParsedValue(SE36RecordDataElement.class, e, null));
        SERVICE_RECORD_DATA_ELEMENT.put(new ControlIdentifierSelector(TYPE_AX, SE50.getIdentifier()),
                e -> AnnotationParser.getParsedValue(SE50RecordDataElement.class, e, null));
        SERVICE_RECORD_DATA_ELEMENT.put(new ControlIdentifierSelector(TYPE_AX, SE55.getIdentifier()),
                e -> AnnotationParser.getParsedValue(SE55RecordDataElement.class, e, null));
        SERVICE_RECORD_DATA_ELEMENT.put(new ControlIdentifierSelector(TYPE_AX, SE56.getIdentifier()),
                e -> AnnotationParser.getParsedValue(SE56RecordDataElement.class, e, null));
        SERVICE_RECORD_DATA_ELEMENT.put(new ControlIdentifierSelector(TYPE_AX, SE61.getIdentifier()),
                e -> AnnotationParser.getParsedValue(SE61RecordDataElement.class, e, null));

        SERVICE_RECORD_DATA_ELEMENT.put(new ControlIdentifierSelector(TYPE_SO, SO10.getIdentifier()),
                e -> AnnotationParser.getParsedValue(SO10RecordDataElement.class, e, null));
        SERVICE_RECORD_DATA_ELEMENT.put(new ControlIdentifierSelector(TYPE_SO, SO20.getIdentifier()),
                e -> AnnotationParser.getParsedValue(SO20RecordDataElement.class, e, null));
        SERVICE_RECORD_DATA_ELEMENT.put(new ControlIdentifierSelector(TYPE_SO, SO30.getIdentifier()),
                e -> AnnotationParser.getParsedValue(SO30RecordDataElement.class, e, null));
        SERVICE_RECORD_DATA_ELEMENT.put(new ControlIdentifierSelector(TYPE_SO, SO40.getIdentifier()),
                e -> AnnotationParser.getParsedValue(SO40RecordDataElement.class, e, null));
        SERVICE_RECORD_DATA_ELEMENT.put(new ControlIdentifierSelector(TYPE_SO, SO42.getIdentifier()),
                e -> AnnotationParser.getParsedValue(SO42RecordDataElement.class, e, null));
        SERVICE_RECORD_DATA_ELEMENT.put(new ControlIdentifierSelector(TYPE_SO, SO50.getIdentifier()),
                e -> AnnotationParser.getParsedValue(SO50RecordDataElement.class, e, null));
        SERVICE_RECORD_DATA_ELEMENT.put(new ControlIdentifierSelector(TYPE_SO, SO60.getIdentifier()),
                e -> AnnotationParser.getParsedValue(SO60RecordDataElement.class, e, null));
        SERVICE_RECORD_DATA_ELEMENT.put(new ControlIdentifierSelector(TYPE_SO, SO70.getIdentifier()),
                e -> AnnotationParser.getParsedValue(SO70RecordDataElement.class, e, null));
        SERVICE_RECORD_DATA_ELEMENT.put(new ControlIdentifierSelector(TYPE_SO, SO71.getIdentifier()),
                e -> AnnotationParser.getParsedValue(SO71RecordDataElement.class, e, null));
        SERVICE_RECORD_DATA_ELEMENT.put(new ControlIdentifierSelector(TYPE_SO, SO72.getIdentifier()),
                e -> AnnotationParser.getParsedValue(SO72RecordDataElement.class, e, null));

        SERVICE_RECORD_DATA_ELEMENT.put(new ControlIdentifierSelector(TYPE_SX, SE10.getIdentifier()),
                e -> AnnotationParser.getParsedValue(SE10RecordDataElement.class, e, null));
        SERVICE_RECORD_DATA_ELEMENT.put(new ControlIdentifierSelector(TYPE_SX, SE11.getIdentifier()),
                e -> AnnotationParser.getParsedValue(SE11RecordDataElement.class, e, null));
        SERVICE_RECORD_DATA_ELEMENT.put(new ControlIdentifierSelector(TYPE_SX, SE13.getIdentifier()),
                e -> AnnotationParser.getParsedValue(com.onenetwork.model.sx.se.SE13RecordDataElement.class,
                        e, null));
        SERVICE_RECORD_DATA_ELEMENT.put(new ControlIdentifierSelector(TYPE_SX, SE15.getIdentifier()),
                e -> AnnotationParser.getParsedValue(SE15RecordDataElement.class, e, null));
        SERVICE_RECORD_DATA_ELEMENT.put(new ControlIdentifierSelector(TYPE_SX, SE16.getIdentifier()),
                e -> AnnotationParser.getParsedValue(com.onenetwork.model.sx.se.SE16RecordDataElement.class,
                        e, null));
        SERVICE_RECORD_DATA_ELEMENT.put(new ControlIdentifierSelector(TYPE_SX, SE17.getIdentifier()),
                e -> AnnotationParser.getParsedValue(com.onenetwork.model.sx.se.SE17RecordDataElement.class,
                        e, null));
        SERVICE_RECORD_DATA_ELEMENT.put(new ControlIdentifierSelector(TYPE_SX, SE20.getIdentifier()),
                e -> AnnotationParser.getParsedValue(com.onenetwork.model.sx.se.SE20RecordDataElement.class,
                        e, null));
        SERVICE_RECORD_DATA_ELEMENT.put(new ControlIdentifierSelector(TYPE_SX, SE30.getIdentifier()),
                e -> AnnotationParser.getParsedValue(com.onenetwork.model.sx.se.SE30RecordDataElement.class,
                        e, null));
        SERVICE_RECORD_DATA_ELEMENT.put(new ControlIdentifierSelector(TYPE_SX, SE35.getIdentifier()),
                e -> AnnotationParser.getParsedValue(com.onenetwork.model.sx.se.SE35RecordDataElement.class,
                        e, null));
        SERVICE_RECORD_DATA_ELEMENT.put(new ControlIdentifierSelector(TYPE_SX, SE36.getIdentifier()),
                e -> AnnotationParser.getParsedValue(com.onenetwork.model.sx.se.SE36RecordDataElement.class,
                        e, null));
        SERVICE_RECORD_DATA_ELEMENT.put(new ControlIdentifierSelector(TYPE_SX, SE40.getIdentifier()),
                e -> AnnotationParser.getParsedValue(SE40RecordDataElement.class, e, null));
        SERVICE_RECORD_DATA_ELEMENT.put(new ControlIdentifierSelector(TYPE_SX, SE41.getIdentifier()),
                e -> AnnotationParser.getParsedValue(SE41RecordDataElement.class, e, null));
        SERVICE_RECORD_DATA_ELEMENT.put(new ControlIdentifierSelector(TYPE_SX, SE50.getIdentifier()),
                e -> AnnotationParser.getParsedValue(com.onenetwork.model.sx.se.SE50RecordDataElement.class,
                        e, null));
        SERVICE_RECORD_DATA_ELEMENT.put(new ControlIdentifierSelector(TYPE_SX, SE55.getIdentifier()),
                e -> AnnotationParser.getParsedValue(com.onenetwork.model.sx.se.SE55RecordDataElement.class,
                        e, null));
        SERVICE_RECORD_DATA_ELEMENT.put(new ControlIdentifierSelector(TYPE_SX, SE56.getIdentifier()),
                e -> AnnotationParser.getParsedValue(com.onenetwork.model.sx.se.SE56RecordDataElement.class,
                        e, null));
        SERVICE_RECORD_DATA_ELEMENT.put(new ControlIdentifierSelector(TYPE_SX, SE60.getIdentifier()),
                e -> AnnotationParser.getParsedValue(SE60RecordDataElement.class, e, null));
        SERVICE_RECORD_DATA_ELEMENT.put(new ControlIdentifierSelector(TYPE_SX, SE61.getIdentifier()),
                e -> AnnotationParser.getParsedValue(com.onenetwork.model.sx.se.SE61RecordDataElement.class,
                        e, null));
        SERVICE_RECORD_DATA_ELEMENT.put(new ControlIdentifierSelector(TYPE_SX, SE90.getIdentifier()),
                e -> AnnotationParser.getParsedValue(SE90RecordDataElement.class, e, null));
        SERVICE_RECORD_DATA_ELEMENT.put(new ControlIdentifierSelector(TYPE_SX, SF10.getIdentifier()),
                e -> AnnotationParser.getParsedValue(SF10RecordDataElement.class, e, null));
        SERVICE_RECORD_DATA_ELEMENT.put(new ControlIdentifierSelector(TYPE_SX, SF20.getIdentifier()),
                e -> AnnotationParser.getParsedValue(SF20RecordDataElement.class, e, null));
        SERVICE_RECORD_DATA_ELEMENT.put(new ControlIdentifierSelector(TYPE_SX, SF25.getIdentifier()),
                e -> AnnotationParser.getParsedValue(SF25RecordDataElement.class, e, null));
        SERVICE_RECORD_DATA_ELEMENT.put(new ControlIdentifierSelector(TYPE_SX, SF30.getIdentifier()),
                e -> AnnotationParser.getParsedValue(SF30RecordDataElement.class, e, null));
        SERVICE_RECORD_DATA_ELEMENT.put(new ControlIdentifierSelector(TYPE_SX, SF31.getIdentifier()),
                e -> AnnotationParser.getParsedValue(SF31RecordDataElement.class, e, null));
        SERVICE_RECORD_DATA_ELEMENT.put(new ControlIdentifierSelector(TYPE_SX, SF35.getIdentifier()),
                e -> AnnotationParser.getParsedValue(SF35RecordDataElement.class, e, null));
        SERVICE_RECORD_DATA_ELEMENT.put(new ControlIdentifierSelector(TYPE_SX, SF36.getIdentifier()),
                e -> AnnotationParser.getParsedValue(SF36RecordDataElement.class, e, null));

        SERVICE_RECORD_DATA_ELEMENT.put(new ControlIdentifierSelector(TYPE_SN, SF10.getIdentifier()),
                e -> AnnotationParser.getParsedValue(com.onenetwork.model.sn_us_isf10.SF10RecordDataElement.class,
                        e, null));
        SERVICE_RECORD_DATA_ELEMENT.put(new ControlIdentifierSelector(TYPE_SN, SF13.getIdentifier()),
                e -> AnnotationParser.getParsedValue(SF13RecordDataElement.class, e, null));
        SERVICE_RECORD_DATA_ELEMENT.put(new ControlIdentifierSelector(TYPE_SN, SF15.getIdentifier()),
                e -> AnnotationParser.getParsedValue(SF15RecordDataElement.class, e, null));
        SERVICE_RECORD_DATA_ELEMENT.put(new ControlIdentifierSelector(TYPE_SN, SF20.getIdentifier()),
                e -> AnnotationParser.getParsedValue(com.onenetwork.model.sn_us_isf10.SF20RecordDataElement.class,
                        e, null));
        SERVICE_RECORD_DATA_ELEMENT.put(new ControlIdentifierSelector(TYPE_SN, SF25.getIdentifier()),
                e -> AnnotationParser.getParsedValue(com.onenetwork.model.sn_us_isf10.SF25RecordDataElement.class,
                        e, null));
        SERVICE_RECORD_DATA_ELEMENT.put(new ControlIdentifierSelector(TYPE_SN, SF30.getIdentifier()),
                e -> AnnotationParser.getParsedValue(com.onenetwork.model.sn_us_isf10.SF30RecordDataElement.class,
                        e, null));
        SERVICE_RECORD_DATA_ELEMENT.put(new ControlIdentifierSelector(TYPE_SN, SF31.getIdentifier()),
                e -> AnnotationParser.getParsedValue(com.onenetwork.model.sn_us_isf10.SF31RecordDataElement.class,
                        e, null));
        SERVICE_RECORD_DATA_ELEMENT.put(new ControlIdentifierSelector(TYPE_SN, SF35.getIdentifier()),
                e -> AnnotationParser.getParsedValue(com.onenetwork.model.sn_us_isf10.SF35RecordDataElement.class,
                        e, null));
        SERVICE_RECORD_DATA_ELEMENT.put(new ControlIdentifierSelector(TYPE_SN, SF36.getIdentifier()),
                e -> AnnotationParser.getParsedValue(com.onenetwork.model.sn_us_isf10.SF36RecordDataElement.class,
                        e, null));
        SERVICE_RECORD_DATA_ELEMENT.put(new ControlIdentifierSelector(TYPE_SN, SF40.getIdentifier()),
                e -> AnnotationParser.getParsedValue(SF40RecordDataElement.class,
                        e, null));
        SERVICE_RECORD_DATA_ELEMENT.put(new ControlIdentifierSelector(TYPE_SN, SF50.getIdentifier()),
                e -> AnnotationParser.getParsedValue(SF50RecordDataElement.class, e, null));
        SERVICE_RECORD_DATA_ELEMENT.put(new ControlIdentifierSelector(TYPE_SN, SF90.getIdentifier()),
                e -> AnnotationParser.getParsedValue(SF90RecordDataElement.class, e, null));

        SERVICE_RECORD_DATA_ELEMENT.put(new ControlIdentifierSelector(TYPE_US_ISF10, SF10.getIdentifier()),
                e -> AnnotationParser.getParsedValue(com.onenetwork.model.sn_us_isf10.SF10RecordDataElement.class,
                        e, null));
        SERVICE_RECORD_DATA_ELEMENT.put(new ControlIdentifierSelector(TYPE_US_ISF10, SF13.getIdentifier()),
                e -> AnnotationParser.getParsedValue(SF13RecordDataElement.class, e, null));
        SERVICE_RECORD_DATA_ELEMENT.put(new ControlIdentifierSelector(TYPE_US_ISF10, SF15.getIdentifier()),
                e -> AnnotationParser.getParsedValue(SF15RecordDataElement.class, e, null));
        SERVICE_RECORD_DATA_ELEMENT.put(new ControlIdentifierSelector(TYPE_US_ISF10, SF20.getIdentifier()),
                e -> AnnotationParser.getParsedValue(com.onenetwork.model.sn_us_isf10.SF20RecordDataElement.class,
                        e, null));
        SERVICE_RECORD_DATA_ELEMENT.put(new ControlIdentifierSelector(TYPE_US_ISF10, SF25.getIdentifier()),
                e -> AnnotationParser.getParsedValue(com.onenetwork.model.sn_us_isf10.SF25RecordDataElement.class,
                        e, null));
        SERVICE_RECORD_DATA_ELEMENT.put(new ControlIdentifierSelector(TYPE_US_ISF10, SF30.getIdentifier()),
                e -> AnnotationParser.getParsedValue(com.onenetwork.model.sn_us_isf10.SF30RecordDataElement.class,
                        e, null));
        SERVICE_RECORD_DATA_ELEMENT.put(new ControlIdentifierSelector(TYPE_US_ISF10, SF31.getIdentifier()),
                e -> AnnotationParser.getParsedValue(com.onenetwork.model.sn_us_isf10.SF31RecordDataElement.class,
                        e, null));
        SERVICE_RECORD_DATA_ELEMENT.put(new ControlIdentifierSelector(TYPE_US_ISF10, SF35.getIdentifier()),
                e -> AnnotationParser.getParsedValue(com.onenetwork.model.sn_us_isf10.SF35RecordDataElement.class,
                        e, null));
        SERVICE_RECORD_DATA_ELEMENT.put(new ControlIdentifierSelector(TYPE_US_ISF10, SF36.getIdentifier()),
                e -> AnnotationParser.getParsedValue(com.onenetwork.model.sn_us_isf10.SF36RecordDataElement.class,
                        e, null));
        SERVICE_RECORD_DATA_ELEMENT.put(new ControlIdentifierSelector(TYPE_US_ISF10, SF40.getIdentifier()),
                e -> AnnotationParser.getParsedValue(SF40RecordDataElement.class,
                        e, null));
        SERVICE_RECORD_DATA_ELEMENT.put(new ControlIdentifierSelector(TYPE_US_ISF10, SF50.getIdentifier()),
                e -> AnnotationParser.getParsedValue(SF50RecordDataElement.class, e, null));
        SERVICE_RECORD_DATA_ELEMENT.put(new ControlIdentifierSelector(TYPE_US_ISF10, SF90.getIdentifier()),
                e -> AnnotationParser.getParsedValue(SF90RecordDataElement.class, e, null));

        SERVICE_RECORD_DATA_ELEMENT.put(new ControlIdentifierSelector(TYPE_SA, SA10.getIdentifier()),
                e -> AnnotationParser.getParsedValue(SA10RecordDataElement.class, e, null));
        SERVICE_RECORD_DATA_ELEMENT.put(new ControlIdentifierSelector(TYPE_SA, SA20.getIdentifier()),
                e -> AnnotationParser.getParsedValue(SA20RecordDataElement.class, e, null));
        SERVICE_RECORD_DATA_ELEMENT.put(new ControlIdentifierSelector(TYPE_SA, SA30.getIdentifier()),
                e -> AnnotationParser.getParsedValue(SA30RecordDataElement.class, e, null));
        SERVICE_RECORD_DATA_ELEMENT.put(new ControlIdentifierSelector(TYPE_SA, SA50.getIdentifier()),
                e -> AnnotationParser.getParsedValue(SA50RecordDataElement.class, e, null));

        SERVICE_RECORD_DATA_ELEMENT.put(new ControlIdentifierSelector(TYPE_NR, N1.getIdentifier()),
                e -> AnnotationParser.getParsedValue(N1RecordDataElement.class, e, null));
        SERVICE_RECORD_DATA_ELEMENT.put(new ControlIdentifierSelector(TYPE_NR, N2.getIdentifier()),
                e -> AnnotationParser.getParsedValue(N2RecordDataElement.class, e, null));
        SERVICE_RECORD_DATA_ELEMENT.put(new ControlIdentifierSelector(TYPE_NR, N3.getIdentifier()),
                e -> AnnotationParser.getParsedValue(N3RecordDataElement.class, e, null));
        SERVICE_RECORD_DATA_ELEMENT.put(new ControlIdentifierSelector(TYPE_NR, N4.getIdentifier()),
                e -> AnnotationParser.getParsedValue(N4RecordDataElement.class, e, null));
    }

    public static final Map<ControlIdentifierSelector, Function<String, Object>> RECORD_DATA_ELEMENT =
            Collections.unmodifiableMap(SERVICE_RECORD_DATA_ELEMENT);
}
